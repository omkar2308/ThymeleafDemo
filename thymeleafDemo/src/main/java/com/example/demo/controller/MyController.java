package com.example.demo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value="/about",method = RequestMethod.GET)
	public String about(Model m) {
		
		m.addAttribute("name","Omkar hajare");
		m.addAttribute("CurrentDate", new Date().toLocaleString());
		System.out.println("in controller...");
		return "about";
	}

}
