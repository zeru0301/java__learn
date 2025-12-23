package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.energy.Product;
import com.example.demo.repository.ProductRepository;

@Controller
public class AdminController {
	
	private final ProductRepository productRepository;
	
	public AdminController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@GetMapping("login")
	public String login() {
		return "/login";
	}
	
	@GetMapping("/adomin/products")
	    public String products() {
	        return "adomin/products";
	  }

//	新商品追加
	@PostMapping("/addProduct")
	public String addProduct(
			@RequestParam String productName,
			@RequestParam int stock,
			@RequestParam int productPrice,
			@RequestParam int categoryId,
			@RequestParam String productDescription,
			@RequestParam String productImages,
			Model model){
		Product product = new Product();
		product.setProductName(productName);
		product.setStock(stock);
		product.setProductPrice(productPrice);
		product.setCategoryId(categoryId);
		product.setProductDiscrption(productDescription);
		product.setProductImages(productImages);
		productRepository.save(product);
		
		return "redirect:/adomin/products";
		
		
	}
//	商品在庫増減
	@PostMapping("/productManager")
	public String productManager(
			@RequestParam int productId,
			@RequestParam int stock,
			Model model) {
		 Product p = productRepository.findById(productId)
		            .orElseThrow(() -> new IllegalArgumentException("商品が存在しません"));

		p.setStock(stock);
		
		productRepository.save(p);
		return "redirect:/adomin/products";
		
	}

}


