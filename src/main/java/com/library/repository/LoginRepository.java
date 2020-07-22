package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.library.model.LoginModel;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel, Integer>{
	
	public LoginModel findByuserName(String userNString);

}
