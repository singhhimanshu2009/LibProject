package com.library.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.library.model.LibrarianSignupModel;
import com.library.model.LoginModel;
import com.library.repository.LoginRepository;

@Service
public class LoginDao {
	
	@Autowired
	LoginRepository loginRepository;
	
	public void SaveLibrarianLogin(LibrarianSignupModel lsm) {
		
		LoginModel loginModel = new LoginModel(lsm.getUserName(), lsm.getPassword());
		loginRepository.save(loginModel);
		
	}

}
