package com.craftsmanship.product.api.application.controller;

import com.craftsmanship.product.api.application.model.request.ProductRequest;
import com.craftsmanship.product.api.domain.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/api/v1/products")
    @ResponseStatus(HttpStatus.OK)
    public void retrieve(ProductRequest productRequest) {
         productService.createProduct(productRequest.getCode(), productRequest.getName());
    }
}
