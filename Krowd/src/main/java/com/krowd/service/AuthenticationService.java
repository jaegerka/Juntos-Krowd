package com.krowd.service;

import com.krowd.beans.Credentials;
import com.krowd.beans.Users;

public interface AuthenticationService {
	
	public Users isValidUser(Credentials credentials);
	
	public Users authenticateUsers(String userName, String passWord);
	

}
