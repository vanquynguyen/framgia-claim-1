package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public ModelAndView showhome() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView showlogin() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping("/resetpassword")
	public ModelAndView showreset() {
		ModelAndView mv = new ModelAndView("resetpassword");
		return mv;
	}
	
	@RequestMapping("/admin")
	public ModelAndView showadmin() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping("/benifit")
	public ModelAndView showbenifit() {
		ModelAndView mv = new ModelAndView("benifit");
		return mv;
	}
	
	@RequestMapping("/profile-employee")
	public ModelAndView showprofileemployee() {
		ModelAndView mv = new ModelAndView("profile-employee");
		return mv;
	}
	
	@RequestMapping("/profile-CPD")
	public ModelAndView showprofileCPD() {
		ModelAndView mv = new ModelAndView("profile-CPD");
		return mv;
	}
}
