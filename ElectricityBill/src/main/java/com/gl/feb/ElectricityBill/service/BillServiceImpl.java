package com.gl.feb.ElectricityBill.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.feb.ElectricityBill.entity.BillCompany;
import com.gl.feb.ElectricityBill.entity.BillDetails;
import com.gl.feb.ElectricityBill.entity.User;
import com.gl.feb.ElectricityBill.mappers.BillDetailsMapper;
import com.gl.feb.ElectricityBill.models.GenerateBillRequest;
import com.gl.feb.ElectricityBill.models.GeneratedBillResponse;
import com.gl.feb.ElectricityBill.repo.BillDetailsRepo;

@Service
public class BillServiceImpl implements BillService{
	
	@Autowired
	BillDetailsRepo billDetailsRepo;
	
	@Autowired
	UserService userService;

	@Override
	public GeneratedBillResponse generateBill(GenerateBillRequest generateBillRequest) {
		User user= userService.findById(generateBillRequest.getUserId());
		BillDetails billDetails=BillDetailsMapper.toBillDetails(generateBillRequest,user );
		billDetails.setAmount(calculateAmount(generateBillRequest.getBillReading(),user.getBillCompany()));
		billDetailsRepo.save(billDetails);
		
		return getResponse(billDetails,user.getBillCompany());
	}
	
	private double calculateAmount(double reading, BillCompany billCompany) {
		return reading*billCompany.getPricePerUnit();
	}
	
	private GeneratedBillResponse getResponse(BillDetails billDetails,BillCompany billCompany ) {
		GeneratedBillResponse generatedBillResponse=new GeneratedBillResponse();
		generatedBillResponse.setBillAmount(billDetails.getAmount());
		generatedBillResponse.setUserName(billDetails.getUserDetails().getUserName());
		generatedBillResponse.setCompanyName(billCompany.getName());
		
		return generatedBillResponse;
	}

	@Override
	public List<GeneratedBillResponse> getAllDetails() {
		List<BillDetails> billDetailsList = billDetailsRepo.findAll();
		List<GeneratedBillResponse> responseList=new ArrayList<>();
		
		for(BillDetails billDetails: billDetailsList ) {
			responseList.add(getResponse(billDetails, billDetails.getUserDetails().getBillCompany()));
		}
		
		return responseList;
	}

}
