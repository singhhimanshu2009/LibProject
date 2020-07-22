package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.library.dao.FindAllBooksDao;
import com.library.model.Book;

@RestController
public class AddController {
	
	@Autowired
	private FindAllBooksDao findAllBooksDao;
	
	@GetMapping("/newBook")
	public ModelAndView init(@ModelAttribute Book book) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("books", findAllBooksDao.findAllBooks());
		mav.addObject("mode", "BOOK_NEW");
		mav.setViewName("index");
		return mav;
		
	}
}
