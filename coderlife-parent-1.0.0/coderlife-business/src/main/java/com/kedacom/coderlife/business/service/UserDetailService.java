package com.kedacom.coderlife.business.service;

import com.kedacom.coderlife.business.model.User;

/**
 * 
 */
public interface UserDetailService {
	
	public User checkLogin(String username, String password);
	
    
}
