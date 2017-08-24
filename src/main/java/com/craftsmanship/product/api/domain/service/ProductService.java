package com.craftsmanship.product.api.domain.service;

import com.craftsmanship.product.api.domain.entity.Product;
import com.craftsmanship.product.api.domain.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;
    private ProductCreatedPublisher productCreatedPublisher;

    public ProductService(ProductRepository productRepository, ProductCreatedPublisher productCreatedPublisher) {
        this.productRepository = productRepository;
        this.productCreatedPublisher = productCreatedPublisher;
    }

    public void createProduct(String code, String name){
        Product product = new Product();
        product.setCode(code);
        product.setName(name);

        productRepository.save(product);
        productCreatedPublisher.publish(product);
    }
}
