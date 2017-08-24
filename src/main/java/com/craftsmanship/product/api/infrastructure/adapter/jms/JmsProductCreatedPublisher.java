package com.craftsmanship.product.api.infrastructure.adapter.jms;

import com.craftsmanship.product.api.domain.entity.Product;
import com.craftsmanship.product.api.domain.service.ProductCreatedPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class JmsProductCreatedPublisher implements ProductCreatedPublisher {

    Logger logger = LoggerFactory.getLogger(JmsProductCreatedPublisher.class);

    public void publish(Product product) {
        //messasing queue related stuff
    }
}
