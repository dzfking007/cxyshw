package com.kedacom.coderlife.business.dao;

import org.springframework.stereotype.Repository;

import com.kedacom.coderlife.business.adapter.JdbcDaoAdapter;
import com.kedacom.coderlife.business.model.User;


@Repository("userDao")
public class UserDao extends JdbcDaoAdapter{

	private static final String GET_USER = "select 1 ";
	
	public User getUser(){
		
		super.getSimpleJdbcTemplate().queryForInt(GET_USER);
		return new User();
	}
	
	
	
}
