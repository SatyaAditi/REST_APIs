package com.example.demo;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

//import com.example.models.BankUser;

@RestController
@SessionAttributes("name")
public class UserController {
  
	@Autowired
	UserRepo repo;
	
	@Autowired 
	AccountRepo arepo;
	
	@Autowired
	MiddleRepo mrepo;
	HashMap<String,String> map=new HashMap<>();
    int userid;
    String username;
    String password;
			
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
		userid=u.getId();
		username=u.getName();
		password=u.getPassword();
		map.put(username, password);
		System.out.println(map);
	   repo.save(u);
	   return u;
	}
	
	@PostMapping("signin")
	public ModelAndView userprofile(BankUser u,Account_details a,@RequestParam String name,@RequestParam String password)
	{
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("bu",u);
		mv.addObject("ad", a);
		System.out.println(repo.findByname(name));
		System.out.println(repo.findBypassword(password));
		LoginController l=new LoginController();
		if(l.validateUser(repo,name, password)==true)
			{mv.setViewName("Profile.jsp");}
		else
			{mv.setViewName("unsuccessful.jsp");}
		
		return mv;
		
	}
	
}
