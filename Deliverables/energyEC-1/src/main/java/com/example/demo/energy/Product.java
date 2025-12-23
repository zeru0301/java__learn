package com.example.demo.energy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	private String productName;
	private String productDescription;
	private Integer productPrice;
	private String productImages;
	private Integer categoryId;
	private Integer stock;
	
	
	public Integer getProductId() {
		 return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;	
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDiscrption(String productDiscripton) {
		this.productDescription = productDiscripton;
	}
	
	public Integer getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	
	public String getProductImages() {
		return productImages;
	}
	public void setProductImages(String productImages) {
		this.productImages = productImages;
	}
	
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	public void decreaseStock(int quantity) {
	    if (this.stock < quantity) {
	        throw new IllegalStateException("在庫不足です");
	    }
	    this.stock -= quantity;
	}

	

}
