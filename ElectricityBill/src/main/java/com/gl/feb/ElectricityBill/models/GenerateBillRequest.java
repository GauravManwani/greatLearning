package com.gl.feb.ElectricityBill.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GenerateBillRequest {

	int userId;
	
	double billReading;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public double getBillReading() {
		return billReading;
	}

	public void setBillReading(double billReading) {
		this.billReading = billReading;
	}
	
	
}
