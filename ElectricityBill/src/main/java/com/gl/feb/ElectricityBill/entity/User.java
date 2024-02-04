package com.gl.feb.ElectricityBill.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name= "user_name")
	private String userName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="company_id", referencedColumnName = "id")
	private BillCompany billCompany;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public BillCompany getBillCompany() {
		return billCompany;
	}

	public void setBillCompany(BillCompany billCompany) {
		this.billCompany = billCompany;
	}
	
	
	

}
