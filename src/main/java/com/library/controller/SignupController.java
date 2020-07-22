package com.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.library.model.LibrarianSignupModel;
import com.library.model.LoginModel;

@Controller
public class SignupController {
	
	@GetMapping("/signup")
	public ModelAndView Signup() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("SignupLibrarian", new LibrarianSignupModel());
		mav.addObject("LoginModel", new LoginModel());
		mav.addObject("home");
		return mav;
	}

}
