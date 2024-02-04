package com.gl.feb.ElectricityBill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.feb.ElectricityBill.models.GenerateBillRequest;
import com.gl.feb.ElectricityBill.models.UserDetailsRequest;
import com.gl.feb.ElectricityBill.service.BillService;
import com.gl.feb.ElectricityBill.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/invoke")
	public String invoke(Model model) {
		model.addAttribute("userDetailsRequest", new UserDetailsRequest());
		return "user_details_save";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute("userDetailsRequest") UserDetailsRequest userDetailsRequest) {
		userService.save(userDetailsRequest);
		return "redirect:/bill";
		
	}
}
