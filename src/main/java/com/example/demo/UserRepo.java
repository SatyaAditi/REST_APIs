package com.example.demo;

import org.springframework.data.repository.CrudRepository;

//DAO object
//Create Read Update Delete
public interface UserRepo extends CrudRepository<User,Integer> {

}
