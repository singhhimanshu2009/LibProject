package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.library.model.Book;

@Repository
public interface UpdateBookRepository extends JpaRepository<Book, Integer> {

}
