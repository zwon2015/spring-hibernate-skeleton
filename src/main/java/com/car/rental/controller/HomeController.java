package com.car.rental.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.car.rental.domain.UserLogin;
import com.car.rental.service.UserService;


@Controller
public class HomeController {
	
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String homepage()
	{
		return "index";
	}
	@RequestMapping("/home")
	public String home()
	{
		return "redirect:/";
	}
	
	@RequestMapping("/login")
	public String loginPage()
	{
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logoutPage()
	{
		return "/login";
	}
	
	@RequestMapping("/403")
	public String loginError()
	{
		return "/403";
	}
	
	@RequestMapping("/newuser")
	public void createAdmin(HttpServletResponse response) throws IOException
	{
		UserLogin user = userService.getUserByUsername("admin");
		
		if(user == null)
		{
			user = new UserLogin();
			user.setUsername("admin");
			user.setPassword("admin");
			user.setEnabled(true);
			userService.changePassword(user);
			response.getWriter().println("User created successfully");
		}else{
			response.getWriter().println("User already Exist");
		}
		
	}
	


}
