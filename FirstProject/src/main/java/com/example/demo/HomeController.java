package com.example.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController  {
    
	@RequestMapping("home")
	
	public String home(String name,HttpSession session)
	{
		session.setAttribute("name", name);
		return "HomeView";
	}
	
	
}
