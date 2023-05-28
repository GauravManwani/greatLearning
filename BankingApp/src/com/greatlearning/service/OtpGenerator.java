package com.greatlearning.service;

public class OtpGenerator {

	public static int generateOTP() {
		int randomPin= (int)((Math.random()*9000)+1000);
		return randomPin;
	}
	
}
