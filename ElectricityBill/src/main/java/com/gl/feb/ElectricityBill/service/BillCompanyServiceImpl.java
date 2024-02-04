package com.gl.feb.ElectricityBill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.feb.ElectricityBill.entity.BillCompany;
import com.gl.feb.ElectricityBill.repo.BillCompanyRepo;

@Service
public class BillCompanyServiceImpl implements BillCompanyService{

	@Autowired
	BillCompanyRepo billCompanyRepo;
	
	@Override
	public void save(BillCompany billCompany) {
		System.out.print("saving billCompany details");
		billCompanyRepo.save(billCompany);
	}

	@Override
	public BillCompany getByName(String companyName) {
		return billCompanyRepo.findByName(companyName).get();
		
	}

}
