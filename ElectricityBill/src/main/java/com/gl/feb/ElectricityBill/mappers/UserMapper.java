package com.gl.feb.ElectricityBill.mappers;


import com.gl.feb.ElectricityBill.entity.BillCompany;
import com.gl.feb.ElectricityBill.entity.User;
import com.gl.feb.ElectricityBill.models.UserDetailsRequest;

public class UserMapper {
	
	
	public static User toUser(UserDetailsRequest userDetailsRequest, BillCompany billCompany) {
		User user= new User();
		user.setBillCompany(billCompany);
		user.setUserName(userDetailsRequest.getUserName());
		return user;
	}

}
