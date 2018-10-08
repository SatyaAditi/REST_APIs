package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.example.models.BankUser;


public interface UserRepo extends JpaRepository<BankUser,Integer> {
  List<BankUser> findByname(String name);
  List<BankUser> findBypassword(String password);
<<<<<<< HEAD
  List<BankUser> findByemail(String email);
=======
  
>>>>>>> fcd4c895cc58ff91fa5af67271c42d0c8458c6fa

	
}
