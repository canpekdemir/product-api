package com.craftsmanship.product.api.infrastructure.adapter.persistence.jpa;

import com.craftsmanship.product.api.domain.entity.Product;
import com.craftsmanship.product.api.domain.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class JpaProductRepository implements ProductRepository {

    @PersistenceContext
    EntityManager entityManager;

    public void save(Product product) {
        entityManager.persist(product);
    }

}
