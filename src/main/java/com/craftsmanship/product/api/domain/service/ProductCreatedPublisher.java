package com.craftsmanship.product.api.domain.service;


import com.craftsmanship.product.api.domain.entity.Product;

public interface ProductCreatedPublisher {

    void publish(Product product);
}
