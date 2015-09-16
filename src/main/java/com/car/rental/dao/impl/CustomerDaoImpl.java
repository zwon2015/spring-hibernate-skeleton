package com.car.rental.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.car.rental.dao.CustomerDao;
import com.car.rental.domain.Customer;
import com.car.rental.util.SessionUtil;


@Repository
public class CustomerDaoImpl extends SessionUtil implements CustomerDao{

	@Override
	public void saveCustomer(Customer customer) {
		getSession().saveOrUpdate(customer);
	}

	@Override
	public Customer getCustomerById(int id) {
		return (Customer) getSession().get(Customer.class, id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		
		return getSession().createQuery("From Customer").list();
	}

	@Override
	public void deleteCustomer(int id) {
		Customer customer = getCustomerById(id);
		if(customer!=null){
			getSession().delete(customer);
		}
	}

}
