package com.example.demo;

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
	@PostMapping("addaccount")
	public Account_details addaccount(@RequestParam double account_balance,@RequestParam double account_no,Account_details a)
	{
		//ModelAndView mv=new ModelAndView("Profile.jsp");
		//mv.addObject("account", a);
		
		a.setAccount_balance(account_balance);
		repo.save(a);
		
		return a;
	}
	
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
	
/*	@PostMapping("updatedeposit")
	public String updateaccountbalance(@RequestParam double amount_deposited,@RequestParam double account_balance,@RequestParam double account_no)
	{
		//ModelAndView mv=new ModelAndView("Profile.jsp");
		Account_details a=repo.getOne(account_no);
		
		a.setAmount_deposited(amount_deposited);
		a.setAccount_balance(account_balance+amount_deposited);
		repo.save(a);
		return "balance updated";
		
	}
	@RequestMapping("updatewithdraw")
	public String updateaccountbalancewithdraw(@RequestParam double amount_withdrawn,@RequestParam double account_balance,@RequestParam double account_no)
	{
		//ModelAndView mv=new ModelAndView("Profile.jsp");
		Account_details a=repo.getOne(account_no);
		
		a.setAmount_withdrawn(amount_withdrawn);
		if(account_balance>amount_withdrawn)
		{
		a.setAccount_balance(account_balance-amount_withdrawn);
		repo.save(a);
		return "balance updated";
		}
		else
		{
			return "insufficient funds";
		}
		
	}*/
	
	@PostMapping("update")
	public String account_updates(@RequestParam double amount_withdrawn,@RequestParam double account_balance,@RequestParam double account_no,@RequestParam double amount_deposited)
	{
		Account_details a = repo.getOne(account_no);
		a.setAccount_balance(account_balance);
		if(amount_withdrawn==0) {
		a.setAmount_deposited(amount_deposited);
		a.setAccount_balance(account_balance+amount_deposited);
		repo.save(a);
		return "balance updated,amount deposited";
		}
		else if(amount_deposited==0)
		{
			a.setAmount_withdrawn(amount_withdrawn);
			if(account_balance>amount_withdrawn)
			{
			a.setAccount_balance(account_balance-amount_withdrawn);
			repo.save(a);
			return "balance updated,amount withdrawn";
			}
			else
			{
				return "insufficient funds";
			}
		}
		else {
		return "error";
		}
	}
	
	@PostMapping("send")
	
	public String send(@RequestParam double account_no,@RequestParam double saccount_no,@RequestParam double amount)
	
	{
		Account_details a = repo.getOne(account_no);
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
	}
	
}
