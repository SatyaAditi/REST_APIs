package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//import com.example.models.BankUser;

@RestController
public class UserController {
  
	@Autowired
	UserRepo repo;
	
	@RequestMapping("home")
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView("home.jsp");
		System.out.println("hello");
		return mv;
    }
	
	@PostMapping("adduser")
	public BankUser addusers(BankUser u)
	{
	   //ModelAndView mv=new ModelAndView("home.jsp");
	   repo.save(u);
	   return u;
	}
	
	@PostMapping("profile")
	public ModelAndView userprofile(BankUser u)
	{
		ModelAndView mv=new ModelAndView("Profile.jsp");
		//u.setName(name);
		mv.addObject("bu",u);
		
		return mv;
		
	}
	
}
