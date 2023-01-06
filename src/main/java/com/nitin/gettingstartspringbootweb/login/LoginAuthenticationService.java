package com.nitin.gettingstartspringbootweb.login;

import org.springframework.stereotype.Service;

@Service
public class LoginAuthenticationService {
	
	
	public boolean authenticate(String name, String password) {
		
		boolean isValidUserName = name.equalsIgnoreCase("nitin");
		boolean isValidPassword = password.equalsIgnoreCase("nitin123");
		
		return isValidUserName && isValidPassword;
		
		
	}

}
