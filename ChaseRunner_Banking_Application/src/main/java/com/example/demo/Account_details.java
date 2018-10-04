package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_details")
public class Account_details {
    @Id
	private double account_no;
	private double account_balance;
	private double amount_withdrawn;
	private double amount_deposited;
	public double getAccount_no() {
		return account_no;
	}
	public void setAccount_no(double account_no) {
		this.account_no = account_no;
	}
	@Override
	public String toString() {
		return "Account_details [account_no=" + account_no + ", account_balance=" + account_balance
				+ ", amount_withdrawn=" + amount_withdrawn + ", amount_deposited=" + amount_deposited + "]";
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	public double getAmount_withdrawn() {
		return amount_withdrawn;
	}
	public void setAmount_withdrawn(double amount_withdrawn) {
		this.amount_withdrawn = amount_withdrawn;
	}
	public double getAmount_deposited() {
		return amount_deposited;
	}
	public void setAmount_deposited(double amount_deposited) {
		this.amount_deposited = amount_deposited;
	}
	
}
