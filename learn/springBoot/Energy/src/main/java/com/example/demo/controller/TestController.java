package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@GetMapping("/test")
	public ModelAndView index(ModelAndView mav) {
		mav.addObject("message","Javaからのレスポンス");
		mav.setViewName("sample");
		ArrayList<String> strList = new ArrayList<String>(); 
		strList.add("1");
		strList.add("2");
		strList.add("3");
		mav.addObject("listValue",strList);
		return mav;
	}

}
