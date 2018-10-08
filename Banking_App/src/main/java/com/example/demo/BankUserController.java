package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class BankUserController {
  
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("home")
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView("HomePage.jsp");
		
		return mv;
	}
	@RequestMapping("UserLogin")
	public ModelAndView login()
	{
	ModelAndView mv= new ModelAndView();			
	
    mv.setViewName("UserLoginView.jsp");
	
		return mv;
	}
	
	@RequestMapping("showusers")
	public List<User> getusers()
	{
		return repo.findAll();
	}
	
	@PostMapping("adduser")
	public User adduser(User u)
	{
	       repo.save(u);
	       return u;
	}
	
	@PostMapping("signin")
	public ModelAndView signin(@PathVariable("name") String name,@PathVariable("password") String password)
	{
		ModelAndView mv=new ModelAndView();
		if(repo.findByname(name)!=null & repo.findBypassword(password)!=null)
		{
			mv.setViewName("signin.jsp");
		}
		else
		{
			mv.setViewName("no_user_found.jsp");
		}
		return mv;
	}
	
}
