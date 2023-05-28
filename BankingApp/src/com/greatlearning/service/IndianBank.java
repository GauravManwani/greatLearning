package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.interfaces.InternetBanking;

public class IndianBank implements InternetBanking{
	
	private int amount;
	private int bankBalance=1000;
	private int otpGenerated;
	private int otp;
	private int bankAccountNo;
	
	Scanner sc=new Scanner(System.in);

	@Override
	public void deposit() {
		System.out.println("Enter the amount you want to deposit");
		amount=sc.nextInt();
		
		if(amount>0) {
			bankBalance = bankBalance + amount;
			System.out.println("amount"+amount+"deposited successfully");
			System.out.println("updated bank balance is: "+bankBalance);
		}else {
			System.out.println("Enter a valid amount");
		}
	}

	@Override
	public boolean withdrawal() {
		System.out.println("enter the amount you want to withdrawl");
		amount = sc.nextInt();
		
		if (bankBalance - amount >= 0) {
			System.out.println("amount " + amount + " withdrawl successfully");
			bankBalance=bankBalance-amount;
			System.out.println("Remaining Bank balance is " + bankBalance);
			return true;
		}else {
			System.out.println("insufficient funds");
			return false;
		}
	}

	@Override
	public int checkBalance() {
		// TODO Auto-generated method stub
		if(this.bankBalance<1000) {
			System.out.println("Atleast Maintain 1000 balance");
		}
		return this.bankBalance;
	}

	@Override
	public boolean transfer() {
		OtpGenerator otpGenerated1=new OtpGenerator();
		System.out.println("Enter the OTP");
		
		otpGenerated = otpGenerated1.generateOTP();
		System.out.println(otpGenerated); // sending to mobile(phone Number)
		otp=sc.nextInt();
		
		if(otp==otpGenerated) {
			System.out.println("otp verification Successful !!!");
			
//			a) Ask the amount that customer wants to transfer
			System.out.println("Enter the amount you want to transfer");
			
			amount = sc.nextInt();
			
			System.out.println("Enter the BankAccount no to which you want to transfer");
			bankAccountNo = sc.nextInt();
			
			if(bankBalance-amount>0) {
				System.out.println("amount " + amount + " transferred successful to bankAccount " + bankAccountNo);
				bankBalance = bankBalance - amount;
				System.out.println("Remaining Bank balance is " + bankBalance);
				return true;
			}else {
				System.out.println("insufficient funds");
				return false;
			}
			
		}else {
			System.out.println("invalid otp please try again");
			return false;
		}
	}

}
