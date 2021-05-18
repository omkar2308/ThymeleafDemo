package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

	@GetMapping("/loop")
	public String iteratorHandler(Model m )  {
		
		List<String> elements = List.of("akshay","omkar","abhi");
		m.addAttribute("names", elements);
		return "iterator";
	}
}
