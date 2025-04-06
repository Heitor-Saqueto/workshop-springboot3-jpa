package com.heitorsaqueto.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heitorsaqueto.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
