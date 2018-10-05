package com.example.demo;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

@Service
@SessionAttributes
public class LoginController {


public boolean validateUser(UserRepo repo, String name,String password)
{
	List<BankUser> namelist=repo.findByname(name);
	System.out.println(namelist);
	List<BankUser> passwordlist = repo.findBypassword(password);
	System.out.println(passwordlist);
	HashMap<String,String> hm=new HashMap<>();
	UserController uc=new UserController();
	hm=uc.map;
	String uname = null,upassword;
	if(namelist ==null || passwordlist==null)
	{
		return false;
	}
	else
	{
		for(BankUser u:namelist ) {
			 uname=u.getName();
			
			 {
		for(BankUser b:passwordlist)
		{
			upassword=b.getPassword();
			if(upassword==hm.get(uname))
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		}
		
	}
	
     }

	return false;
}
}
