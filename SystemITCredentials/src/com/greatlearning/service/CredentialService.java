package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;

public class CredentialService implements ICredentials{

	@Override
	public String generateEmailAdderess(String firstName, String lastName, String department) {
		return firstName+lastName+"@"+department+".gl.com";
	}

	@Override
	public String generatePassword() {
		String password="";
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		String values=capitalLetters+smallLetters+numbers+specialCharacters;
		
		Random random=new Random();
		
		for(int i=0;i<2;i++) {
			int index= random.nextInt(capitalLetters.length());
			char c=capitalLetters.charAt(index);
			
			password+=String.valueOf(c);
			
		}
		
		for(int i=0;i<2;i++) {
			int index= random.nextInt(smallLetters.length());
			char c=smallLetters.charAt(index);
			
			password+=String.valueOf(c);
			
		}
		
		for(int i=0;i<2;i++) {
			int index= random.nextInt(numbers.length());
			char c=numbers.charAt(index);
			
			password+=String.valueOf(c);
		}
		
		for(int i=0;i<2;i++) {
			int index= random.nextInt(specialCharacters.length());
			char c=specialCharacters.charAt(index);
			
			password+=String.valueOf(c); // 8
			
		}
		
		String result="";
		for(int i=0;i<8;i++) {
			int index= random.nextInt(password.length());
			char c=password.charAt(index);
			
			result+=String.valueOf(c);
			
		}
		password=result;
		
		
		return password;
	}

	@Override
	public void showCredentials(Employee emp) {
		System.out.println("");
		System.out.println("");
		System.out.println("Hi "+emp.getFirstName()+" "+emp.getLastName()+". Following are the credentials: ");
		System.out.println("Email is: "+emp.getEmail());
		System.out.println("Password is: "+emp.getPassword());
	}

}
