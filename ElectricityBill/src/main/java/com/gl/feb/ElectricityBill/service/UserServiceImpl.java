package com.gl.feb.ElectricityBill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.feb.ElectricityBill.entity.BillCompany;
import com.gl.feb.ElectricityBill.entity.User;
import com.gl.feb.ElectricityBill.mappers.UserMapper;
import com.gl.feb.ElectricityBill.models.UserDetailsRequest;
import com.gl.feb.ElectricityBill.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	BillCompanyService billCompanyService;
	

	@Override
	public void save(UserDetailsRequest userDetailsRequest) {
		BillCompany billCompany=billCompanyService.getByName(userDetailsRequest.getCompanyName());
		userRepo.save(UserMapper.toUser(userDetailsRequest, billCompany));
	}


	@Override
	public User findById(int id) {
		return userRepo.findById(id).get();
	}

}
