package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.HelloService;
import com.example.demo.service.ItemService;

@Controller
public class HelloController {
//	ファイナルで変更不可	
	private final HelloService helloService;
	private final ItemService itemService;

	
	public HelloController(HelloService helloService,ItemService itemService) {
		this.helloService = helloService;
		this.itemService = itemService;
	}
	
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("name","springBoot");
		model.addAttribute("items",itemService.getItem());
		return "index"; 
	
	}
	
	@PostMapping("/hello")
	public String hello(@RequestParam String userName,Model model) {
		model.addAttribute("name",helloService.createMessage(userName));
		return "index";
	}
	

}
