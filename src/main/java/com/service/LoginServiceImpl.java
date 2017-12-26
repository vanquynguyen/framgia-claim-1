package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.LoginDAO;
import com.model.Users;

public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginDAO loginDAO;
	
	public LoginDAO getLoginDAO() {
		return loginDAO;
	}

	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	public Users validateUserCredential(String email, String password) {
		Users users = getLoginDAO().getUserDetailsByEmailAndPassword(email, password);
		return users;
	}

}
