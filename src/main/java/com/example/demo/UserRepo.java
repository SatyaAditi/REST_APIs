package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

//DAO object
//Create Read Update Delete
//JPARepositary has more features than crudrepositary
public interface UserRepo extends JpaRepository<User,Integer> {

	List<User> findByamount(int amount);
	List<User> findByamountGreaterThan(int amount);
	
	@Query("from User where amount=?1 order by name")//This is JPA Query Language,with this we can create any complex query.
	List<User> findByamountSorted(int amount);
	
	
	
}
