package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
   /*Autowire connects 2 objects in the spring ioc container.But in Spring boot the repo object is directly connecte to user object. 
	As long as you dont associate an interface object with an undefined method,it wont show error.Here we are linking interface object with another object*/
	@Autowired
	UserRepo repo;
	
	
@RequestMapping("UserLogin")
		public ModelAndView home()
		{
		ModelAndView mv= new ModelAndView();			
		
	    mv.setViewName("UserView");
		
			
			
			return mv;
			
			
			
		}

	   @RequestMapping("/adduser")
       public String addUser(User u)
       {
		   repo.save(u);
    	   return "UserView";
       }
}