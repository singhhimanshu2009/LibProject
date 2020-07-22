package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.library.dao.DeleteBookDao;
import com.library.dao.FindAllBooksDao;

@RestController
public class DeleteController {
	
	@Autowired
	private FindAllBooksDao findAllBooksDao;
	
	@Autowired
	private DeleteBookDao deleteBookDao;
	
	@GetMapping("/deleteBook")
	public ModelAndView deleteBook(@RequestParam int id) {
		ModelAndView mav = new ModelAndView();
		deleteBookDao.DeleteBook(id);
		mav.addObject("books", findAllBooksDao.findAllBooks());
		mav.addObject("mode", "BOOK_VIEW");
		mav.setViewName("index");
		return mav;
	}

}
