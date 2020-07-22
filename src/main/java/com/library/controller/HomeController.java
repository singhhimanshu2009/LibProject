package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.library.dao.FindAllBooksDao;

@Controller
public class HomeController {

	@Autowired
	private FindAllBooksDao findAllBooksDao;

	@GetMapping("/")
	public ModelAndView init(Model model) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("books", findAllBooksDao.findAllBooks());
		mav.addObject("mode", "BOOK_VIEW");
		mav.setViewName("index");
		return mav;
	}
}