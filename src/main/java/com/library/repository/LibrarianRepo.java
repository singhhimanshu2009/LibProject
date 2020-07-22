package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.model.LibrarianSignupModel;

@Repository
public interface LibrarianRepo extends JpaRepository<LibrarianSignupModel, Integer> {

}
