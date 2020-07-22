package com.library.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.LibrarianSignupModel;
import com.library.repository.LibrarianRepo;

@Service
public class LibrarianDao {
	
	@Autowired
	LibrarianRepo librarianRepo;
	public void savelibrarian(LibrarianSignupModel librarianSignupModel) {
		librarianRepo.save(librarianSignupModel);
	}

}
