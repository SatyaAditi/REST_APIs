package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

//DAO object
//Create Read Update Delete
public interface UserRepo extends CrudRepository<User,Integer> {

	List<User> findByamount(int amount);
	List<User> findByamountGreaterThan(int amount);
	
	@Query("from User where amount=?1 order by name")//Thsi is JPA Query Language,with this we can create any complex query.
	List<User> findByamountSorted(int amount);
	
	
	
}
