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
	
<<<<<<< HEAD

=======
	@Autowired
	MiddleRepo mrepo;
	HashMap<String,String> map=new HashMap<>();
>>>>>>> fcd4c895cc58ff91fa5af67271c42d0c8458c6fa
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
<<<<<<< HEAD
		/*ModelAndView mv=new ModelAndView();
		mv.addObject("bankuser", u);*/
=======
	   //ModelAndView mv=new ModelAndView("home.jsp");
		userid=u.getId();
		username=u.getName();
		password=u.getPassword();
		map.put(username, password);
		System.out.println(map);
>>>>>>> fcd4c895cc58ff91fa5af67271c42d0c8458c6fa
	   repo.save(u);
	   return u;
	}
	
	@PostMapping("signin")
<<<<<<< HEAD
	public ModelAndView userprofile(BankUser u,Account_details a)
=======
	public ModelAndView userprofile(BankUser u,Account_details a,@RequestParam String name,@RequestParam String password)
>>>>>>> fcd4c895cc58ff91fa5af67271c42d0c8458c6fa
	{
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("bu",u);
		mv.addObject("ad", a);
<<<<<<< HEAD
		String email=u.getEmail();
		String password=u.getPassword();
		userid=u.getId();
		System.out.println(u.getEmail());
		System.out.println(u.getPassword());
		LoginController l=new LoginController();
		if(l.validateUser(repo,email, password)==true )
		{
			if(l.firstTimeLogin(arepo,repo,email)==true)
			{
				mv.setViewName("AddAccount.jsp");
			}
			else
			{
				mv.setViewName("Profile.jsp");
			}
		}

		else
		{
			mv.setViewName("unsuccessful.jsp");
		}
=======
		System.out.println(repo.findByname(name));
		System.out.println(repo.findBypassword(password));
		LoginController l=new LoginController();
		if(l.validateUser(repo,name, password)==true)
			{mv.setViewName("Profile.jsp");}
		else
			{mv.setViewName("unsuccessful.jsp");}
>>>>>>> fcd4c895cc58ff91fa5af67271c42d0c8458c6fa
		
		return mv;
		
	}
<<<<<<< HEAD

	
=======
>>>>>>> fcd4c895cc58ff91fa5af67271c42d0c8458c6fa
	
}
