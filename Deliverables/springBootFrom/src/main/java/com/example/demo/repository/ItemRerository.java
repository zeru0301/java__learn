package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ItemRerository {
	private final List<String> items = new ArrayList<>();

	public List<String> findAll(){
		return items;
		
	}
	public void save(String itemName) {
		items.add(itemName);
	}
}
