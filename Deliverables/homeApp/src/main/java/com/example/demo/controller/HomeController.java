package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.SkillService;
import com.example.demo.service.WorkService;

@Controller
public class HomeController {
	private final SkillService skillService;
	private final WorkService workservice;
	
	public HomeController(SkillService skillService,WorkService workservice) {
		this.skillService = skillService;
		this.workservice  = workservice;
	}
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("skills",skillService.getSkills());
		model.addAttribute("works",workservice.getWorks());
		return "index";
	}

}
