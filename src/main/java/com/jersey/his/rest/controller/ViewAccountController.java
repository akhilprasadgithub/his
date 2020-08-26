package com.jersey.his.rest.controller;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jersey.his.repository.ContactRepository;
import com.jersey.his.rest.dto.ContactDTO;
import com.jersey.his.service.ContactService;

@Controller
public class ViewAccountController {
	@Autowired
	private ContactService service;
	
	@GetMapping(value={"/deleteContactById"})
	public String deleteById(@RequestParam("contactId") Long contactId) {
		boolean isDeleted = service.deleteById(contactId); 
		if(isDeleted) {
			return "redirect:/viewAllContacts";
		}
		return null;
	}
	
	@GetMapping(value={"/editContactById"})
	public String editContactById(@RequestParam("contactId")Long contactId, Model model) {
		ContactDTO cdto = service.retrieve(contactId);
		model.addAttribute("contactDTO", cdto);
		return "createContact";
	}

}
