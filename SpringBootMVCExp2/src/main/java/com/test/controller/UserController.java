package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.User;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {
	
	
	/*public String submitform (HttpServletRequest request,Model model)
	{
		
		String uname=request.getParameter("user");
		String pas=request.getParameter("pwd");
		
		User user=new User();
		user.setPassowrd(pas);
		user.setUname(uname);
		
		model.addAttribute("info",user);
		
		return "userform";
		
		
	}*/
	@RequestMapping("/submituser")
	
	
	public String submitForm(@RequestParam("user") String usr,@RequestParam("pwd") String pas,Model model,User user)
	{
		
		
		User user1=new User();
		user1.setPassowrd(pas);
		user1.setUname(usr);
		
		model.addAttribute("info",user1);
		
		return "userdata";
	}

}
