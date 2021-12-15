package com.tcs.ins.cust.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.ins.cust.repository.entiry.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}