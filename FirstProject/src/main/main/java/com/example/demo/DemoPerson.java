package com.example.demo;

import org.springframework.stereotype.Component;
//this is a pojo
@Component
public class DemoPerson {

	private String name;
	private String age;
	private String hobby;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void show()
	{
		System.out.println("this is demo");
	}
	
}
