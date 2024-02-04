package com.gl.feb.ElectricityBill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.feb.ElectricityBill.entity.BillCompany;
import com.gl.feb.ElectricityBill.models.GenerateBillRequest;
import com.gl.feb.ElectricityBill.service.BillCompanyService;

@Controller
@RequestMapping("/billcompany")
public class BillCompanyController {

	@Autowired
	BillCompanyService billCompanyService;
	
	
	@GetMapping("/invoke")
	public String invoke(Model model) {
		model.addAttribute("billCompanyDetails", new BillCompany());
		return "bill_company_save";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("billCompanyDetails") BillCompany billCompany) {
		System.out.print("saving details");
		billCompanyService.save(billCompany);
		return "redirect:/bill";
		
	}
}
