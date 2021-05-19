package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.print.attribute.standard.DateTimeAtCompleted;

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

	//handling iteration 
	@GetMapping("/loop")
	public String iteratorHandler(Model m )  {
		
		List<String> elements = List.of("akshay","omkar","abhi");
		m.addAttribute("names", elements);
		return "iterator";
	}
	
	//handling condition 
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		m.addAttribute("isActive", false);
		m.addAttribute("gender","M");
		
		List<String> list = List.of("12","22","212");
		m.addAttribute("mylist",list);
		return "condition";
	}
	
//handler for including fragement 
	@GetMapping("/services")
	public String fragementHandler(Model m) {
		
		m.addAttribute("title","i like programing");
		m.addAttribute("Subtitle",LocalDateTime.now().toString());
		return "services";
	}
	
}
