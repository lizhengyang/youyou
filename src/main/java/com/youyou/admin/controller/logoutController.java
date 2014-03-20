package com.youyou.admin.controller;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="logout")
public class logoutController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String logout(){
//		SecurityUtils.getSubject().logout();
		return "redirect:/login";
	}
}
