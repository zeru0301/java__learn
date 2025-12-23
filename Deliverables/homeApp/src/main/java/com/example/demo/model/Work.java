package com.example.demo.model;

public class Work {

	private String name;
	private String image;
	private String workUrl;
	
	public Work(String name,String image,String workUrl) {
	
		this.name =  name;
		this.image = image;
		this.workUrl = workUrl;
	}
	
	
	public String getName() {
		return name;
	}
	public String getImage() {
		return image;
	}
	public String getWorkUrl() {
		return workUrl;
	}

}
