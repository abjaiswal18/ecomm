package com.training.order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.order_service.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long>{

}
