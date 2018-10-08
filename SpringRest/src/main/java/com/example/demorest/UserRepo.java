package com.example.demorest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(collectionResourceRel="users",path="users")
public interface UserRepo extends JpaRepository<User, Integer>{

}
