package com.tcs.ins;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tcs.ins.cust.repository.CustomerRepository;
import com.tcs.ins.cust.repository.OrderRepository;
import com.tcs.ins.cust.repository.entiry.Customer;
import com.tcs.ins.cust.repository.entiry.Order;

import org.slf4j.Logger;

@SpringBootApplication
public class CustomerApplication implements CommandLineRunner {
	Customer customer = new Customer();
	Order order = new Order();
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	OrderRepository orderRepository;

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		customer.setId(10L);
		customer.setAddress("Kolkata");
		customer.setName("Ali");
		customer.setPhoneNo(9856325896L);
		customerRepository.save(customer);
		order.setOrderId(1L);
		order.setOrdernumber(101L);
		order.setVersion("V1");
		orderRepository.save(order);
		LOGGER.info("Customer Details {} " + customer.getName());
		LOGGER.info("Oder Details {} " + order.getVersion());
	}
}