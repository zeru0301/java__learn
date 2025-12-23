package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.energy.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class PurchaseService {
	private final ProductRepository productRepository;
	
	public PurchaseService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public Product purchase(int productId, int quantity) {

        // 数量0・マイナス対策
        if (quantity <= 0) {
            throw new IllegalArgumentException("数量は1以上で指定してください");
        }

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("商品が存在しません"));

        // 在庫チェック（例）
        if (product.getStock() < quantity) {
            throw new IllegalStateException("在庫が不足しています");
        }

        // 在庫減らす
        product.setStock(product.getStock() - quantity);
        productRepository.save(product);
        return product;
	}
}
