package com.example.register_eder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.register_eder.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
