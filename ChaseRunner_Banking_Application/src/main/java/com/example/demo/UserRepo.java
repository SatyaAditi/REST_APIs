package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.example.models.BankUser;


public interface UserRepo extends JpaRepository<BankUser,Integer> {
  List<BankUser> findByname(String name);
  List<BankUser> findBypassword(String password);
  
  
	
}
