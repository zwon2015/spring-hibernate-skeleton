package com.car.rental.service;

import java.util.List;

import com.car.rental.domain.Customer;

public interface CustomerService {

	public void saveCustomer(Customer customer);
	public Customer getCustomerById(int id);
	public List<Customer> getAllCustomer();
	public void deleteCustomer(int id);








}
