package com.jersey.his.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jersey.his.rest.dto.ContactDTO;

@Controller
public class CreateAccountController {

	@GetMapping(value= {"/", "/createContact"})
	public String loadCreateContactForm(Model model) {
		ContactDTO contactDTO = new ContactDTO();
		model.addAttribute("contactDTO", contactDTO);
		return "loadCreateContactForm";
	}
}
