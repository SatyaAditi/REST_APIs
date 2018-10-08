package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity

public class User {
    @Id
    @GeneratedValue
    @Column(name="name")
	private String name;
    @Column(name="email")
	private String email;
    @Column(name="dob")
	private Date dob;
    @Column(name="password")
	private String password;
    @Column(name="id")
	private int id;
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", dob=" + dob + ", password=" + password + ", id="
				+ id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return dob;
	}
	public void setDate(Date date) {
		this.dob = date;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
