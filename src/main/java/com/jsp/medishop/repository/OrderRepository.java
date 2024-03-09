package com.jsp.medishop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.medishop.dto.OrderEntity;

/**
 * @author Aabhas
 */
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {

}
