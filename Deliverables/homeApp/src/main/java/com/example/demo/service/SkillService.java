package com.example.demo.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Skill;

@Service
public class SkillService {
	
	public List<Skill> getSkills(){
		return List.of(
				new Skill("HTML","fall1.png"),
				new Skill("CSS","fall2.png"),
				new Skill("JavaScript","fall3.png"),
				new Skill("Java","fall4.png"),
				new Skill("SQL","fall5.png"),
				new Skill("C#","fall6.png")
				);
				
		
	}

}
