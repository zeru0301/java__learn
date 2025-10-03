package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	@GetMapping("/input")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("input");
		return mav;
		
	}
	@GetMapping("/formTest")
	public ModelAndView formTest(
		@RequestParam("value1") String inputValue1,
		@RequestParam("value2") String inputValue2,
		
		ModelAndView mav) {
	mav.addObject("outputValue1",inputValue1);
	mav.addObject("outputValue2",inputValue2);
	mav.setViewName("output");
	return mav;
	}

}
