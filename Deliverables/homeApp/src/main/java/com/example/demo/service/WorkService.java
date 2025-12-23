package com.example.demo.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Work;

@Service
public class WorkService {
	public List<Work> getWorks(){
		return List.of(
				new Work("4eachブログ","img1.png","https://github.com/zeru0301/html_css_js__learn/tree/main/4eachblog"),
				new Work("武蔵陶器","img2.png","https://github.com/zeru0301/html_css_js__learn/tree/main/musasitouki_demo"),
				new Work("おみくじ","img3.png","https://github.com/zeru0301/html_css_js__learn/tree/main/omikuzi"),
				new Work("お問い合わせフォーム","img4.png","https://github.com/zeru0301/php__learn/tree/main/contactform1"),
				new Work("energyEC","img8.png","https://github.com/zeru0301/Chash_learn/tree/main/energyEC")
				);
		
	}
	

}
