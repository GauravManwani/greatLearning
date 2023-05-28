package com.greatlearning.model;

public class Customer{
	
	private String bankAccountNumber;
	private String password;
	
	public Customer() {
		
	}
	
	public Customer(String bankAccountNumber, String password) {
		this.bankAccountNumber=bankAccountNumber;
		this.password=password;
	}
	
	
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber=bankAccountNumber;
	}
	
	public String getBankAccountNumber() {
		return this.bankAccountNumber;
	}
	
	public void setPassword(String password) {
		 this.password=password;
	}
	
	public String getPassword() {
		return this.password;
	}

}
