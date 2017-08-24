package com.craftsmanship.product.api.domain.repository;


import com.craftsmanship.product.api.domain.entity.Product;

public interface ProductRepository {

    void save(Product product);
}
