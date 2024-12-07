package com.klu.Handloom.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	@GetMapping("/")
	public String nav()
	{
		return "nav";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	 
	@GetMapping("/singup")
	public String singup()
	{
		return "singup";
	}
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	 @GetMapping("/about")
	public String about()
	{
		return "about";
	}
	@GetMapping("/contact")
	public String contact()
	{
		return "contact";
	}
}
