package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Service.ProductService;
import com.example.demo.energy.Product;
import com.example.demo.repository.ProductRepository;


@Controller
public class HtmlController {
	private final ProductRepository productRepository;
	private final ProductService productService;
	
	public HtmlController(ProductRepository productRepository,ProductService productService) {
		this.productRepository = productRepository;
		this.productService    = productService;
	}
	
//	ﾎｰﾑページ
	@GetMapping("/index")
	public String index() {
		return "index";
	}
//	商品ページ
	@GetMapping("/merchandise")
	public String merchandise(Model model) {
		model.addAttribute("products",productRepository.findAll());
		return "merchandise";
	}
	
//	お問い合わせページ
	@GetMapping("/inquiry")
	public String inquiry() {
		return "inquiry";
	}
	
//	商品購入
	@PostMapping("/confirm")
	public String confirm(
			@RequestParam int productId,
			@RequestParam int quantity,
			Model model) {
		Product product = productRepository.findById(productId)
	            .orElseThrow();
		model.addAttribute("product", product);
	    model.addAttribute("quantity", quantity);
		return "confirm";
		
	}
	
	@PostMapping("/confirmComplete")
	public String confirmComplete(
			@RequestParam int productId,
			@RequestParam int quantity
			) {
		productService.purchase(productId, quantity);
		return "confirmComplete";
		
	}
	
}
