package com.company.dao;

import com.company.Util.User;

public interface UserDAO {
	boolean isValidUser(String username, String password);
	boolean registerData(User user);
}
