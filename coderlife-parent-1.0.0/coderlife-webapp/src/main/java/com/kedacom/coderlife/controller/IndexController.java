package com.kedacom.coderlife.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kedacom.coderlife.web.util.RandomValidateCode;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public String index(Model model){
		return "home";
	}
	
	@RequestMapping(value="register",method=RequestMethod.GET)
	public String regist(){
		return "register";
	}
	
	
	@RequestMapping(value="ImageCode",method=RequestMethod.GET)
	public void generateImageCode(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
        response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        RandomValidateCode randomValidateCode = new RandomValidateCode();
        try {
            randomValidateCode.getRandcode(request, response);//输出图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
}
