package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.interfaces.InternetBanking;
import com.greatlearning.model.Customer;
import com.greatlearning.service.IndianBank;
import com.greatlearning.service.OtpGenerator;

public class DriverClass {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String bankAccountNumber;
		String password;
		
		//create a customer object
		Customer customer1=new Customer("Cust1234","pass@123");
		
		System.out.println("Welcome to login page");
		System.out.println();
		System.out.println("Enter bank Account Number");
		
		bankAccountNumber=sc.nextLine();
		
		System.out.println("Enter password");
		
		password=sc.nextLine();
		boolean isValid=validateCredentials(bankAccountNumber,password,customer1);
		
		if(isValid) {
			process(sc);
		}else {
			System.out.println("Invalid Credentials");
			sc.close();
		}
		
	}
	
	private static boolean validateCredentials(String bankAccountNumber, String password, Customer customer) {
		boolean returnValue=false;
		if(customer.getBankAccountNumber().equals(bankAccountNumber) && customer.getPassword().equals(password)) {
			System.out.println("Welcome to Indian Bank");
			returnValue=true;
		}
		
		return returnValue;
	}
	
	private static void process(Scanner sc) {
		int option=10;
		InternetBanking banking=new IndianBank();
		
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("Enter the operation number that you want to perform");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdrawl");
			System.out.println("4. Transfer");
			System.out.println("0. Logout");
			System.out.println("-----------------------------------------------");
			
			option=sc.nextInt(); // 0
			
			switch(option) {
				case 0:
					System.out.println("Logging Out");
					break;
				case 1:
					int balance=banking.checkBalance();
					System.out.println(balance);
					break;
				case 2:
					banking.deposit();
					break;
				case 3:
					banking.withdrawal();
					break;
				case 4:
					banking.transfer();
					break;
				default:
					System.out.println("Invalid option");
			}
			
		}while(option != 0);
		
		System.out.println("Logout Success");
		sc.close();
	}

}
