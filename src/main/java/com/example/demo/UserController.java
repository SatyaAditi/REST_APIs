package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


//Rest controller is used for restful services,the data displayed at client side is either in XML format or JSON format.
//If we want to restrict to any one type of data,we specify it after path with produces keyword.
@RestController
public class UserController
{
   /*Autowire connects 2 objects in the spring ioc container.But in Spring boot the repo object is directly connecte to user object. 
	As long as you dont associate an interface object with an undefined method,it wont show error.Here we are linking interface object with another object*/
	@Autowired
	UserRepo repo;
	
	
@RequestMapping("UserLogin")
		public ModelAndView home()
		{
		ModelAndView mv= new ModelAndView();			
		
	    mv.setViewName("UserView");
		
			return mv;
		}
//Post mapping is for sending post requests.If we want to post the request and write the data in json raw format in the requestbody
//we need to specify @Requestbody before the arguments being passed.
	   @PostMapping("/adduser")
       public User addUser(@RequestBody User u)
       {
		   repo.save(u);//as it extends crud
		   //repo directly saves the value in the database as it extends crud repository which does create ,update and stuff.All this is managed by JPA.JPA created the tabel based on the variables in the user class with id as primary key.
    	   return u;
    	   //Returning the object of user class and this object is displayed as JSOn or XML.
       }
	   
	   @GetMapping("/user")
	  //It is not necessary to write Responsebody all the time as we specified it as Rsetcontroller
	   public List<User> getusers()
	   {
		  // ModelAndView mv=new ModelAndView("showuser");
		  
		 
		  /* User user=  repo.findById(id).orElse(new User());//Feature by java 8,if the id doesnt exist ,optional will take care if it. Or else we can type .oeElse and create a new null object and if the id is not present it will show null.
		   
		   System.out.println(repo.findByamount(1000));
		   System.out.println(repo.findByamountGreaterThan(30));
		   System.out.println(repo.findByamountSorted(20));*/
		  /* mv.addObject(user);
		   
		   return mv;*/
		   return repo.findAll();
		   
	   }
	   
	   @RequestMapping("/user/{id}")
	   @ResponseBody
	   
	   public Optional<User> getuser(@PathVariable("id") int id)
	   {
		  
		   return repo.findById(id);		   
	   }
	   
	   @DeleteMapping("/user/{id}")
	   //To delete data using postman
	   public String deleteUser(@PathVariable int id)
	   {
		   User u=repo.getOne(id);
		   repo.delete(u);
		   return "deleted successfully";
	   }

	   //To update data through resquest body
	   @PutMapping(path="/adduser",consumes= {"application/json"})
       public User updateorsaveUser(@RequestBody User u)
       {
		   repo.save(u);//as it extends crud
		   //repo directly saves the value in the database as it extends crud repository which does create ,update and stuff.All this is managed by JPA.JPA created the tabel based on the variables in the user class with id as primary key.
    	   return u;
    	   //Returning the object of user class and this object is displayed as JSOn or XML.
       }
	   
}	   
