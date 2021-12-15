package com.tcs.ins.cust.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.ins.cust.repository.entiry.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
