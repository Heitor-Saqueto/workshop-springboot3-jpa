package com.heitorsaqueto.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heitorsaqueto.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
