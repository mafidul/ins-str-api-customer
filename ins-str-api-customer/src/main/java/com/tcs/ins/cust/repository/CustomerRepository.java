package com.tcs.ins.cust.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.ins.cust.repository.entiry.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}