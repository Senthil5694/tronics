package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Dao.CategoryDao;
import com.Dao.ProductDao;
import com.Dao.SupplierDao;
import com.Util.FileUtil;
import com.Util.Util;
import com.Model.Category;
import com.Model.Product;
import com.Model.Supplier;

@Controller
public class ProductController {
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private SupplierDao supplierDao;
	
	private String path = "F:\\tronicsville\\";
	
	@RequestMapping(value="/products")
	public String listProducts(Model model)	{
		model.addAttribute("product",new  Product());
		model.addAttribute("category", new Category());
		model.addAttribute("supplier",new Supplier());
		model.addAttribute("productList",  this.productDao.list());
		model.addAttribute("categoryList", this.categoryDao.list());
		model.addAttribute("supplierList", this.supplierDao.list());
		return "products";
	}
	
	@RequestMapping(value="/addproduct",method=RequestMethod.POST)
	public String addproduct(@ModelAttribute("product") Product product,Model model){
		String newpid = Util.removeComma(product.getPid());
		product.setPid(newpid);
		Category category=categoryDao.getByName(product.getCategory().getCname());
		categoryDao.saveOrUpdate(category);
		Supplier supplier=supplierDao.getByName(product.getSupplier().getName());
		supplierDao.saveOrUpdate(supplier);
		product.setCategory(category);
		product.setSupplier(supplier);
		product.setCategory_id(category.getCid());
		product.setSupplier_id(supplier.getSid());
		productDao.saveOrUpdate(product);
		MultipartFile image=product.getImage();
		FileUtil.upload(path, image, product.getPid() + ".jpg");
		model.addAttribute("productList", this.productDao.list());
		return "redirect:/products";
	
	/*public String addProduct(@ModelAttribute("product")Product product,Model model){
	Category category = categoryDao.getByName(product.getCategory().getCname());
	categoryDao.saveOrUpdate(category);
	Supplier supplier = supplierDao.getByName(product.getSupplier().getName());
	supplierDao.saveOrUpdate(supplier);
	MultipartFile image=product.getImage();
	Path path=Paths.get("/images/"+product.getName()+".jpg");
	System.out.println(path.toString());
	if(image!=null && !image.isEmpty()){
		try{
			System.out.println("inside try image");
			image.transferTo(new File(path.toString()));
		}catch (IOException e){
			e.printStackTrace();
			throw new RuntimeException("product image saving failed",e);
		}
	}
	product.setCategory(category);
	product.setSupplier(supplier);
	product.setCategory_id(category.getCid());
	product.setSupplier_id(supplier.getSid());
	productDao.saveOrUpdate(product);
	model.addAttribute("productList",this.productDao.list());
	return "products";*/
	}
	@RequestMapping("/removeproduct/{id}")
	public String deleteProduct(@PathVariable("id") String id,ModelMap model)throws Exception{
		try{
			productDao.delete(id);
			model.addAttribute("msg", "Successfully Deleted");
		}catch (Exception e){
			model.addAttribute("msg", e.getMessage());
			e.printStackTrace();
		}
		return "redirect:/products";
		}
		@RequestMapping("editproduct/{id}")
		public String editproduct(@PathVariable("id") String id, Model model){
			System.out.println("editproduct");
			model.addAttribute("product", this.productDao.get(id));
			model.addAttribute("productList", this.productDao.list());
			model.addAttribute("categoryList", this.categoryDao.list());
			model.addAttribute("supplierList", this.supplierDao.list());
			return "products";		
	}
		@RequestMapping("/getproduct/{id}")
		public String getSelectedProduct(@PathVariable("id") String id,Model model,RedirectAttributes redirectattributes){
			redirectattributes.addFlashAttribute("selectedProduct", productDao.get(id));
			model.addAttribute("categoryList",this.categoryDao.list());
			return "product";
			
		}

}
