package com.library.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.Book;
import com.library.repository.SaveBookRepository;

@Service
public class SaveDao {
	
	@Autowired
	private SaveBookRepository saveBookRepository;
	
	public void saveBookDetails(Book book) {
		saveBookRepository.save(book);
	}

}