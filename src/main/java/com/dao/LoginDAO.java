package com.dao;

import com.model.Users;

public interface LoginDAO {
	public Users getUserDetailsByEmailAndPassword(String email,String password);
}
