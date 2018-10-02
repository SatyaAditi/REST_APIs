package com.example.demorest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Entity is used for telling the jpa that this class is used for database table.
@Entity
public class User {
    //Id is the primary key and GeneratedValue is used for autoincrementing the id.
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String tech;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}
	
	
}
