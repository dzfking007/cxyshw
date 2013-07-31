package com.kedacom.coderlife.bussiness.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.kedacom.coderlife.bussiness.dao.UserDao;

@Service("userDetailService")
public class UserDetailServiceImpl implements UserDetailService{

	@Resource
	private UserDao userDao;
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	public void checkLogin() {
		
		userDao.getUser();
		logger.info("check Login!");
	}

}
