package com.heitorsaqueto.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heitorsaqueto.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
