package com.gl.feb.ElectricityBill.service;

import com.gl.feb.ElectricityBill.entity.User;
import com.gl.feb.ElectricityBill.models.UserDetailsRequest;

public interface UserService {

	void save(UserDetailsRequest userDetailsRequest);
	
	User findById(int id);
}
