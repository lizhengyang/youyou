package com.youyou.admin.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.youyou.admin.service.ShiroDbRealm.ShiroUser;




@Controller
@RequestMapping(value="/admin")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET,value="/login")
	public String login(){
		ShiroUser user = (ShiroUser)SecurityUtils.getSubject().getPrincipal();
		if(user == null){
			return "/account/login";
		}else{
			return "redirect:/admin/welcome";
		}
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String fail(@RequestParam(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM) String userName, Model model) {
			model.addAttribute(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM, userName);
			return "/account/login";
	}
	
	@RequestMapping(value="/welcome")
	public String welcome(){
		return "mainpage/welcome";
	}
}
