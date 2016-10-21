package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Dao.SupplierDao;
import com.Model.Supplier;
import com.Util.Util;

@Controller
public class SupplierController {
	@Autowired(required=true)
	private Supplier supplier;
	
	@Autowired(required=true)
	private SupplierDao supplierDao;
	
	@RequestMapping(value="/suppliers")
	public String listsupplier(Model model){
	model.addAttribute("supplier",supplier);
	model.addAttribute("supplierList",this.supplierDao.list());
	return "suppliers";
	}
	@RequestMapping(value="/addsupplier")
	public String addsupplier(@ModelAttribute Supplier supplier,Model model){
		String newsid = Util.removeComma(supplier.getSid());
		supplier.setSid(newsid);
	supplierDao.saveOrUpdate(supplier);
	/*ModelAndView mv = new ModelAndView();
		String msg= "Supplier added Successfully";
if(flag!=true)
{
	msg = "operation could not success";
}
mv.addObject("msg", msg);*/
return "redirect:/suppliers";
	}
	@RequestMapping("/removesupplier/{sid}")
	public String deletesupplier(@PathVariable("sid") String sid, Model model)throws Exception{
		boolean flag = supplierDao.delete(sid);
		ModelAndView mv = new ModelAndView();
				String msg= "Successfully deleted";
		if(flag!=true)
		{
			msg = "operation could not success";
		}
		mv.addObject("msg", msg);
		return "redirect:/suppliers";
	}
	@RequestMapping("/editsupplier/{sid}")
	public String editsupplier(@PathVariable("sid")String sid,Model model){
		model.addAttribute("supplier",this.supplierDao.get(sid));
		model.addAttribute("supplierList",this.supplierDao.list());
		return "suppliers";
	}

}
