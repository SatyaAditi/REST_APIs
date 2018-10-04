package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepo extends JpaRepository<Account_details,Double>{
    
	/*
	@Query("update account_details set account_details.account_balance=?1 where account_details.account_no=?2")
	Account_details saveaccount_balance(double updated_balance,double account_no);
	*/
}
