package com.example.demo;

import org.springframework.data.repository.CrudRepository;

//DAO object
public interface UserRepo extends CrudRepository<User,Integer> {

}
