package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ItemRepository {
	public List<String> findAll(){
		return List.of("りんご","みかん","バナナ");
	}
}
