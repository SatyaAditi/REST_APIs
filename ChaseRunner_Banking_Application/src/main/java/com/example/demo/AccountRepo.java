package com.example.demo;

<<<<<<< HEAD
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepo extends JpaRepository<Account_details,Long>{
    
	List<Account_details> findByuser_id(int id);
	List<Account_details> findByuser(BankUser user);
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepo extends JpaRepository<Account_details,Double>{
    
	/*
	@Query("update account_details set account_details.account_balance=?1 where account_details.account_no=?2")
	Account_details saveaccount_balance(double updated_balance,double account_no);
	*/
>>>>>>> fcd4c895cc58ff91fa5af67271c42d0c8458c6fa
}
