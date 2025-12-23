package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.repository.ItemRerository;

@Service
public class ItemService {
	private final ItemRerository itemRepository;
	
	public ItemService(ItemRerository itemRepository) {
		this.itemRepository = itemRepository;
	}
	
	public List<String> getItems(){
		return itemRepository.findAll();
	}
	
	public void addItem(String itemName) {
		itemRepository.save(itemName);
	}

}
