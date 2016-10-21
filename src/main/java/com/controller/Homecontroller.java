package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Dao.CategoryDao;
import com.Dao.ProductDao;
import com.Dao.SupplierDao;
import com.Model.Category;
import com.Model.Product;
import com.Model.Supplier;

@Controller
public class Homecontroller {
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private Product product;
	
	@Autowired
	private SupplierDao supplierDao;
	
	@Autowired
	private Category category;
	
	@Autowired
	private Supplier supplier;
	
	@RequestMapping(value="/home")
    public ModelAndView home(HttpSession session){
		ModelAndView mv = new ModelAndView("/home");
		session.setAttribute("category", category);
		session.setAttribute("categoryList", categoryDao.list());
		session.setAttribute("product", product);
		session.setAttribute("supplier", supplier);
		session.setAttribute("productList", productDao.list());
		session.setAttribute("supplierList", supplierDao.list());
		
		return mv;	
	}
	@RequestMapping("/contactus")
	public String contactus(){
		return "contactus";
	}
	@RequestMapping("/aboutus")
	public String aboutus(){
		return "aboutus";
	}
	@RequestMapping("/mobiles")
	public String mobiles(){
	return "mobiles";
    }
	@RequestMapping("/laptops")
	public String laptops(){
		return "laptops";
	}
	}
