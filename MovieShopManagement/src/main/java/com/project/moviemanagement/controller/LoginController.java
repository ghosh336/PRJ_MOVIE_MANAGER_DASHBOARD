package com.project.moviemanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.moviemanagement.model.User;
import com.project.moviemanagement.model.UserRole;
import com.project.moviemanagement.service.LoginService;
import com.project.moviemanagement.validator.LoginDataValidator;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(path="/moviemanagement", method=RequestMethod.GET)
	public ModelAndView viewLoginPage(ModelAndView loginmv) {
		
		
		loginmv.addObject("loginvalidator", new LoginDataValidator());
		loginmv.setViewName("movieManagementLogin");
		return loginmv;
	}
	
	@RequestMapping(path = "/login", method=RequestMethod.POST)
	public String validateLogin(@Valid @ModelAttribute("loginvalidator") LoginDataValidator logindata, BindingResult result, Model m) {
		
		//Blank User Id or password
		if (result.hasErrors()) {
			return "movieManagementLogin";
		}

		
		User loggedinUser = loginService.validateLogin(logindata);
		
		//Invalid User Id or Password or both
		if (loggedinUser == null) {
			m.addAttribute("loginError", "UserId or/and Password is/are incorrect, Please recheck and try again.");
			return "movieManagementLogin";
		}
		
		if (loggedinUser.getUserRole().equals(UserRole.ADMIN)) {
			return "moviePageForAdmin";
		} else if (loggedinUser.getUserRole().equals(UserRole.COMMON_VIEWER)) {
			return "moviePageForCommonUser";
		} else {
			//Do Nothing, for now, In Future there may be other action or more roles
		}
		
		return "movieHomePage";
	}
	
	
	@ModelAttribute
	public Model commonData(Model loginPage) {
		loginPage.addAttribute("pageTitle", "Movie Management Dashboard");
		loginPage.addAttribute("pageFooterOne", "SG Softwares Pvt. Ltd.");
		loginPage.addAttribute("footerTwo", "2012-2050 All Rights Reserved");
		return loginPage;
	}
}
