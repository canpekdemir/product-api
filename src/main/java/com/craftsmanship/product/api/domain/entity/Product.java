package com.craftsmanship.product.api.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "name", nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
