package com.jersey.his.rest.controller;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jersey.his.core.ReadProperties;

@Controller
public class RedirectController {

	@GetMapping(value={"/success"})
	public String success(Model model) {
		return "success";
	}
	
	@GetMapping(value = {"/error"})
	public String error(Model model) {
		return "error";
	}
}
