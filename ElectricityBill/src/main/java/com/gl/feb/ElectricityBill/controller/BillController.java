package com.gl.feb.ElectricityBill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.feb.ElectricityBill.models.GenerateBillRequest;
import com.gl.feb.ElectricityBill.models.GeneratedBillResponse;
import com.gl.feb.ElectricityBill.service.BillService;

@Controller
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	BillService billService;
	
	@GetMapping
	public String homePage(Model model) {
		model.addAttribute("details", billService.getAllDetails());
		return "Success";
	}
	
	@GetMapping("/invoke")
	public String invoke(Model model) {
		model.addAttribute("generateBillRequest", new GenerateBillRequest());
		return "generate_bill";
	}

	@PostMapping("/generate")
	public String generateBill(@ModelAttribute("generateBillRequest") GenerateBillRequest generateBillRequest,Model model) {
		
		GeneratedBillResponse generatedBillResponse= billService.generateBill(generateBillRequest);
		return "redirect:/bill";
		
	}
}
