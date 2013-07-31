package com.kedacom.coderlife.bussiness.dao;

import org.springframework.stereotype.Repository;

import com.kedacom.coderlife.bussiness.adapter.JdbcDaoAdapter;
import com.kedacom.coderlife.bussiness.model.User;

@Repository("userDao")
public class UserDao extends JdbcDaoAdapter{

	private static final String GET_USER = "select 1 ";
	
	public User getUser(){
		
		super.getSimpleJdbcTemplate().queryForInt(GET_USER);
		return new User();
	}
	
	
	
}
