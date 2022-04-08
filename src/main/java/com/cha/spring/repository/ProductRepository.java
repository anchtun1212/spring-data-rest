package com.cha.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cha.spring.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
