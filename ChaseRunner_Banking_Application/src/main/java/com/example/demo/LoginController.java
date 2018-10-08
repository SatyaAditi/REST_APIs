package com.example.demo;

<<<<<<< HEAD
=======
import java.util.HashMap;
>>>>>>> fcd4c895cc58ff91fa5af67271c42d0c8458c6fa
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

@Service
@SessionAttributes
public class LoginController {


<<<<<<< HEAD
public boolean validateUser(UserRepo repo, String email,String password)
{
	List<BankUser> emaillist=repo.findByemail(email);
	for(BankUser u:emaillist)
	{
		System.out.println(u.getPassword());
		String pass=u.getPassword();
		if(password.equals(pass))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	return false;
	
}

public boolean firstTimeLogin(AccountRepo arepo,UserRepo repo, String email)
{
	
	List<BankUser> emaillist=repo.findByemail(email);
	int id;
    
	for(BankUser u:emaillist)
	{
		//id=u.getId();
		List<Account_details> userlist=arepo.findByuser(u);
		for(Account_details a:userlist)
		{
		if(a.getUser()==null)
			return true;
		else
			return false;
		}
	}
	return true;
}
}
=======
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
>>>>>>> fcd4c895cc58ff91fa5af67271c42d0c8458c6fa
