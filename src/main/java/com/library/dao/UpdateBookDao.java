package com.library.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.Book;
import com.library.repository.UpdateBookRepository;

@Service
public class UpdateBookDao {
	
	@Autowired
	private UpdateBookRepository updateBookRepository;
	
	public Book findOne(int id) {
		Optional<Book> findBook = updateBookRepository.findById(id);
		if(findBook !=null) {
			return findBook.get();
		}else {
			return null;
		}
	}
	
	public void saveBook(Book book) {
		updateBookRepository.save(book);
	}

}
