package com.gl.feb.ElectricityBill.service;

import java.util.List;

import com.gl.feb.ElectricityBill.models.GenerateBillRequest;
import com.gl.feb.ElectricityBill.models.GeneratedBillResponse;


public interface BillService {

	GeneratedBillResponse generateBill(GenerateBillRequest generateBillRequest);
	
	List<GeneratedBillResponse> getAllDetails();
}
