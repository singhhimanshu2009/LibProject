package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.library.dao.FindAllBooksDao;
import com.library.dao.UpdateBookDao;
import com.library.model.Book;

@RestController
public class SaveController {
	
	@Autowired
	private UpdateBookDao updateBookDao;
	
	@Autowired
	private FindAllBooksDao findAllBooksDao;

	@PostMapping(value = "/save")
	public ModelAndView addBook(@ModelAttribute Book book) {
		ModelAndView mav = new ModelAndView();
		updateBookDao.saveBook(book);
		mav.addObject("books", findAllBooksDao.findAllBooks());
		mav.addObject("mode", "BOOK_VIEW");
		mav.setViewName("index");
		return mav;
	}

}
