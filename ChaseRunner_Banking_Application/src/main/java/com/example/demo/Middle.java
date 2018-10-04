package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="middle")
public class Middle {
    @Id 
	private int id;
	private double account_no;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Middle [id=" + id + ", account_no=" + account_no + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAccount_no() {
		return account_no;
	}
	public void setAccount_no(double account_no) {
		this.account_no = account_no;
	}
	
	
}
