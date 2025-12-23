package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
//	Service層を使う（処理の分離）
	public String createMessage(String name) {
		return "こんにちは" + name;
	}
	

}
