package com.service;

import com.model.Users;

public interface LoginService {
	public abstract Users validateUserCredential(String email,String password);
}
