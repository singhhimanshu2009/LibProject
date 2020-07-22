package com.library.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.library.dao.LibrarianDao;
import com.library.dao.LoginDao;
import com.library.model.LibrarianSignupModel;
import com.library.model.LoginModel;
import com.library.repository.LoginRepository;

@Controller
public class LibrarianController {

	@Autowired
	LibrarianDao librarianDao;

	@Autowired
	LoginDao loginDao;

	@PostMapping(value = "/signup")
	public ModelAndView Register(@ModelAttribute LibrarianSignupModel lsm) {
		ModelAndView mav = new ModelAndView();
		librarianDao.savelibrarian(lsm);
		loginDao.SaveLibrarianLogin(lsm);
		mav.setViewName("librarianPanel");
		return mav;
	}

	@Autowired
	LoginRepository loginRepository;

	@PostMapping("/login")
	public ModelAndView Login(@ModelAttribute LoginModel loginModel, HttpSession sesion) {
		ModelAndView mav = new ModelAndView();

		try {

			LoginModel model = loginRepository.findByuserName(loginModel.getUserName());

			if (model != null) {

				if (model.getPassword().equals(loginModel.getPassword())) {
					
					String username = (String) sesion.getAttribute(loginModel.getUserName());
					
					sesion.setAttribute("username", model); // add object to HttpSession

					mav.addObject("loginUser", model);
					mav.setViewName("index");

				}

			} else {

				mav.setViewName("login");

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return mav;
	}	
	
}
