package com.kedacom.coderlife.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kedacom.coderlife.business.service.UserDetailService;
import com.kedacom.coderlife.web.util.DirectlyRenderUtils;


@Controller
@RequestMapping("/")
public class LoginController {
	
	@Resource
	private UserDetailService userDetailService;
	
	/**
	 * 登录
	 * */
	@RequestMapping(value="login",method=RequestMethod.POST)
	public void checkLogin(HttpServletResponse response,String userName,String password){
		JSONObject obj = new JSONObject();
		try{
			if(true){
				obj.put("success", Boolean.TRUE);
				obj.put("description","登录成功！");
			}
		}catch(Exception e){
			obj.put("success", Boolean.FALSE);
			obj.put("description", e.getMessage());
			e.printStackTrace();
		}finally{
			DirectlyRenderUtils.renderJson(response,obj);
		}
	}
	
	/**
	 * 注册
	 * */
	@RequestMapping(value="register",method=RequestMethod.POST)
	public void registerUser(HttpServletResponse response,String userName,String password){
		JSONObject obj = new JSONObject();
		try{
			obj.put("success", Boolean.TRUE);
			obj.put("description","注册成功！");
		}catch(Exception e){
			obj.put("success", Boolean.FALSE);
			obj.put("description", e.getMessage());
			e.printStackTrace();
		}finally{
			DirectlyRenderUtils.renderJson(response,obj);
		}
	
	}
}
