package com.gl.feb.ElectricityBill.service;

import com.gl.feb.ElectricityBill.entity.BillCompany;

public interface BillCompanyService {
	
	void save(BillCompany billCompany);
	
	BillCompany getByName(String companyName);
}
