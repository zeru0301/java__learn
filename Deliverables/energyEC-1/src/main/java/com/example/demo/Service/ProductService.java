package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.energy.Product;
import com.example.demo.energy.ProductHistory;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.PurchaseHistoryRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final PurchaseHistoryRepository historyRepository;

    public ProductService(ProductRepository productRepository,
                          PurchaseHistoryRepository historyRepository) {
        this.productRepository = productRepository;
        this.historyRepository = historyRepository;
    }

    @Transactional
    public void purchase(int productId, int quantity) {

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("商品が存在しません"));

      
        // 在庫を減らす
        product.setStock(product.getStock() - quantity);
        productRepository.save(product);

        // 購入履歴を保存
        ProductHistory history = new  ProductHistory();
        history.setProductId(productId);
        history.setQuantity(quantity);

        historyRepository.save(history);
    }
}
