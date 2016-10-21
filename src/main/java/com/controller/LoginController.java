package com.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Dao.CategoryDao;
import com.Dao.ProductDao;
import com.Dao.RegisterDao;
import com.Dao.SupplierDao;
import com.Model.Category;
import com.Model.Product;
import com.Model.RegisterModel;
import com.Model.Supplier;

@Controller
public class LoginController {
	@Autowired
     RegisterModel registerModel;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	 RegisterDao registerDao;
	
	@Autowired
	private Category category;
	
	@Autowired
	private SupplierDao supplierDao;
	
	@Autowired
	private Supplier supplier;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private Product product;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView register(@ModelAttribute RegisterModel registerModel){
		return new ModelAndView("register");
	}
	@RequestMapping(value="/Success",method=RequestMethod.POST)
	public ModelAndView success(@ModelAttribute RegisterModel registerModel)
	{
		ModelAndView mv;
		String msg;
		msg="you have registered successfully please login now";
		registerDao.save(registerModel);
		mv= new ModelAndView("Success");
		mv.addObject("msg",msg);
		return mv;
		
	}
	
	@RequestMapping(value="/check")
	public ModelAndView login(@RequestParam(value="username") String username,
			@RequestParam(value="password") String password,HttpSession session){
		System.out.println("login controller");
/*String name = SecurityContextHolder.getContext().getAuthentication().getName();
		
		@SuppressWarnings("unchecked")
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		String page="";
		
		String role="ROLE_ADMIN";
		for (GrantedAuthority authority:authorities) 
		{
		 System.out.println(authority.getAuthority());*/
		registerModel = registerDao.isValidUser(username, password);
		ModelAndView mv = null;
		if(registerModel == null){
        mv = new ModelAndView ("login");
		mv.addObject("msg", "Invalid credentials please try again");
	} else {
		if (registerModel.getRole().equals("ROLE_ADMIN")){
			mv = new ModelAndView("admin");
		session.setAttribute("categoryList", categoryDao.list());
		session.setAttribute("supplierList", supplierDao.list());
		session.setAttribute("productList", productDao.list());
		
		session.setAttribute("category", category);
		session.setAttribute("supplier", supplier);
		session.setAttribute("product", product);
	}
	else if (registerModel.getRole().equals("ROLE_USER")){
			mv = new ModelAndView("user");
		session.setAttribute("username", registerModel.getUsername());
	}
	}
		
	return mv;	
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request,HttpSession session){
		ModelAndView mv = new ModelAndView("home");
		session.invalidate();
		session=request.getSession(true);
		session.setAttribute("category", category);
		session.setAttribute("categoryList", categoryDao.list());
		mv.addObject("logoutmessage","you are successfully logged out");
		mv.addObject("loggedout", "true");
		return mv;
	}
	@RequestMapping(value="/login")
	public String login(){
	return "login";
	}	

	
}
