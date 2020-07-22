package com.library.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.Book;
import com.library.repository.FindAllBooksRepository;

@Service
public class FindAllBooksDao {
	
	@Autowired
	private FindAllBooksRepository findAllBooksRepository;
	
	public Collection<Book> findAllBooks(){
		List<Book> books = new ArrayList<Book>();
		for (Book book : findAllBooksRepository.findAll()) {
			books.add(book);
		}
		
		return books;
	}

}
