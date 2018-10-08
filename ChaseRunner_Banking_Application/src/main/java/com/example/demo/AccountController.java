package com.example.demo;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> fcd4c895cc58ff91fa5af67271c42d0c8458c6fa
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AccountController {

	@Autowired
	AccountRepo repo;
<<<<<<< HEAD
    @Autowired
    UserRepo urepo;


	

	@PostMapping("addaccount")
	public Account_details addaccount(Account_details a,@RequestParam String useremail)
	{
		/*user_account_no=a.getAccount_no();
		user_account_balance=a.getAccount_balance();*/
	    List<BankUser> user=urepo.findByemail(useremail);
	    int userid;
	    for (BankUser bankuser:user)
	    {
	    	userid=bankuser.getId();
	    	a.setUser(bankuser);
	    
	    }
	    
		repo.save(a);
		
=======
	@Autowired
	MiddleRepo middlerepo;
	double user_account_no;
	double user_account_balance;

	@PostMapping("addaccount")
	public Account_details addaccount(@RequestParam double account_balance,@RequestParam double account_no,Account_details a)
	{
		
		a.setAccount_balance(account_balance);
		repo.save(a);
		user_account_no=a.getAccount_no();
		user_account_balance=a.getAccount_balance();
>>>>>>> fcd4c895cc58ff91fa5af67271c42d0c8458c6fa
		
		return a;
	}
	
<<<<<<< HEAD
    @PostMapping("accountinfo")
    public ModelAndView accountinfo(Account_details a,BankUser u,@RequestParam String user_email)
    {
    	ModelAndView mv=new ModelAndView("account_info.jsp");
    	String uname = null;
    	int userid = 0;
    	long acc_id = 0;
    	double acc_balance = 0;
    	List<BankUser> user=urepo.findByemail(user_email);
    	for(BankUser b:user)
    	{
    		 uname=b.getName();
    		 userid=b.getId();
    	}
    	u.setName(uname);
    	mv.addObject("b_u", u);
    	List<Account_details> ad=repo.findByuser_id(userid);
    	for(Account_details acc:ad)
    	{
    		acc_id=acc.getAccount_no();
    		acc_balance=acc.getAccount_balance();
    	}
    	a.setAccount_balance(acc_balance);
    	a.setAccount_no(acc_id);
    	mv.addObject("a_d", a);
    	return mv;
    }
	
	@PostMapping("updatedeposit")
	public String updateaccountbalance(@RequestParam double amount_deposited,@RequestParam String user_email)
	{
		//ModelAndView mv=new ModelAndView("Profile.jsp");
		
    	int userid = 0;
    	
    	List<BankUser> user=urepo.findByemail(user_email);
    	for(BankUser b:user)
	    	{
	    		
	    		 userid=b.getId();
	    	}
	   
		List<Account_details> a=repo.findByuser_id(userid);
		for(Account_details acc:a)
			{
			    double account_balance=acc.getAccount_balance();
				acc.setAmount_deposited(amount_deposited);
				acc.setAccount_balance(account_balance+amount_deposited);
				repo.save(acc);
			}
=======
/*	@PostMapping("depositaccount")
	public String depositaccount(@RequestParam double amount_deposited,@RequestParam double account_no)
	{
		//ModelAndView mv=new ModelAndView("account_deposit.jsp");
		double acc_no=a.getAccount_no();
		double acc_balance=a.getAccount_balance();
		double acc_deposit=a.getAmount_deposited();
		double total =acc_balance+acc_deposit;
		repo.saveaccount_balance(total,acc_no);
	     
		
		Account_details ad=repo.getOne(account_no);
	   ad.setAmount_deposited(amount_deposited);
	    
		repo.save(ad);
		return "deposited";
	}*/
	
	@PostMapping("updatedeposit")
	public String updateaccountbalance(@RequestParam double amount_deposited)
	{
		//ModelAndView mv=new ModelAndView("Profile.jsp");
		Account_details a=repo.getOne(user_account_no);
		
		a.setAmount_deposited(amount_deposited);
		a.setAccount_balance(user_account_balance+amount_deposited);
		repo.save(a);
>>>>>>> fcd4c895cc58ff91fa5af67271c42d0c8458c6fa
		return "balance updated";
		
	}
	@RequestMapping("updatewithdraw")
<<<<<<< HEAD
	public String updateaccountbalancewithdraw(@RequestParam double amount_withdrawn,@RequestParam String user_email1)
	{
			int userid = 0;
    	
    	   List<BankUser> user=urepo.findByemail(user_email1);
    	   for(BankUser b:user)
	    	{
	    		
	    		 userid=b.getId();
	    	}
	   
		 List<Account_details> a=repo.findByuser_id(userid);
		 for(Account_details acc:a)
		{
			double account_balance=acc.getAccount_balance();
			acc.setAmount_withdrawn(amount_withdrawn);
			if(account_balance>amount_withdrawn)
				{
				acc.setAccount_balance(account_balance-amount_withdrawn);
				repo.save(acc);
				return "balance updated";
				}
			else
			{
				return "insufficient funds";
			}
		}
		return "error";
=======
	public String updateaccountbalancewithdraw(@RequestParam double amount_withdrawn)
	{
		//ModelAndView mv=new ModelAndView("Profile.jsp");
		Account_details a=repo.getOne(user_account_no);
		
		a.setAmount_withdrawn(amount_withdrawn);
		if(user_account_balance>amount_withdrawn)
		{
		a.setAccount_balance(user_account_balance-amount_withdrawn);
		repo.save(a);
		return "balance updated";
		}
		else
		{
			return "insufficient funds";
		}
>>>>>>> fcd4c895cc58ff91fa5af67271c42d0c8458c6fa
		
	}
	
	
	
	@PostMapping("send")
	
<<<<<<< HEAD
	public String send(@RequestParam long saccount_no,@RequestParam double amount,@RequestParam String user_email2)
	
	{
		int userid = 0;
    	
 	   List<BankUser> user=urepo.findByemail(user_email2);
 	   for(BankUser b:user)
	    	{
	    		
	    		 userid=b.getId();
	    	}
		List<Account_details> a=repo.findByuser_id(userid);
		for(Account_details acc:a)
		{
		//long acc_no=acc.getAccount_no();
		Account_details b= repo.getOne(saccount_no);
		double present_account_balance_receiver=b.getAccount_balance();
		double present_account_balance_sender=acc.getAccount_balance();
		if(present_account_balance_sender>=amount)
			{
			acc.setAccount_balance(present_account_balance_sender-amount);
			b.setAccount_balance(present_account_balance_receiver+amount);
			repo.save(acc);
			repo.save(b);
			return "sent";
			}
		else
			{
				return "insufficient funds";
			}
		}
		return "error";
=======
	public String send(@RequestParam double saccount_no,@RequestParam double amount)
	
	{
		Account_details a = repo.getOne(user_account_no);
		Account_details b= repo.getOne(saccount_no);
		double present_account_balance_receiver=b.getAccount_balance();
		double present_account_balance_sender=a.getAccount_balance();
		if(present_account_balance_sender>=amount)
		{
		a.setAccount_balance(present_account_balance_sender-amount);
		b.setAccount_balance(present_account_balance_receiver+amount);
		repo.save(a);
		repo.save(b);
		return "sent";
		}
		else
		{
			return "insufficient funds";
		}
>>>>>>> fcd4c895cc58ff91fa5af67271c42d0c8458c6fa
	}
	
}
