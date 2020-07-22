package com.library.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.library.repository.DeleteBookRepository;

@Service
public class DeleteBookDao {
	
	@Autowired
	private DeleteBookRepository deleteBookRepository;
	
	public void DeleteBook(int id) {
		deleteBookRepository.deleteById(id);
	}

}
