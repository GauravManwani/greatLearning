package com.gl.feb.ElectricityBill.mappers;

import com.gl.feb.ElectricityBill.entity.BillDetails;
import com.gl.feb.ElectricityBill.entity.User;
import com.gl.feb.ElectricityBill.models.GenerateBillRequest;

public class BillDetailsMapper {

	public static BillDetails toBillDetails(GenerateBillRequest generateBillRequest, User userDetails) {
		BillDetails billDetails= new BillDetails();
		billDetails.setReading(generateBillRequest.getBillReading());
		billDetails.setUserDetails(userDetails);
		return billDetails;
	}
	
}
