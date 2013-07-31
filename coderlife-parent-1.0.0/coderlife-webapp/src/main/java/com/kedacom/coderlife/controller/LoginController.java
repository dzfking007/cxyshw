package com.kedacom.coderlife.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kedacom.coderlife.business.service.UserDetailService;


@Controller
@RequestMapping("/")
public class LoginController {
	
	@Resource
	private UserDetailService userDetailService;
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String checkLogin(){
		userDetailService.checkLogin();
		return "Login1212";
	}
	
	

}
