package com.example.register_eder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.register_eder.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
