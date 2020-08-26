package com.jersey.his.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jersey.his.core.ReadProperties;
import com.jersey.his.data.entity.ContactEntity;
import com.jersey.his.rest.dto.ContactDTO;
import com.jersey.his.service.ContactService;

@Controller
public class CreateAccountController {
	@Autowired
	private ContactService service;

	@GetMapping(value= {"/", "/createContact"})
	public String loadCreateContactForm(Model model) {
		ContactDTO contactDTO = new ContactDTO();
		model.addAttribute("contactDTO", contactDTO);
		return "createContact";
	}
	
	@PostMapping(value={"/createContact"})
	public String createContact(@ModelAttribute("contactDTo") ContactDTO contactDTO, RedirectAttributes attribute) {
		boolean isSaved = service.insert(contactDTO);
		if(isSaved) {
			attribute.addFlashAttribute("success", ReadProperties.message.get("insertSuccess"));
			return "redirect:/success";
		}
		else {
			attribute.addFlashAttribute("error", ReadProperties.message.get("insertFailed"));
			return "redirect:/error";
		}
	}
	
	@GetMapping(value={"/viewAllContacts"})
	public String getAllContacts(Model model) {
		List<ContactDTO> list = service.retrieveAll();
		model.addAttribute("cdto", list);
		return "viewContact";
	}
}
