package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.library.dao.UpdateBookDao;

@RestController
public class UpdateBookController {
	
	@Autowired
	private UpdateBookDao updateBookDao;
	
	@GetMapping("/updateBook")
	public ModelAndView init(@RequestParam int id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("book", updateBookDao.findOne(id));
		mav.addObject("mode", "BOOK_EDIT");
		mav.setViewName("index");
		return mav;
	}

}