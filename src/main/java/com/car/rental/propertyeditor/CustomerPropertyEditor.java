package com.car.rental.propertyeditor;

import java.beans.PropertyEditorSupport;

import com.car.rental.domain.Customer;
import com.car.rental.service.CustomerService;

public class CustomerPropertyEditor extends PropertyEditorSupport{
	
	CustomerService customerService;
	public CustomerPropertyEditor(CustomerService customerService){
		this.customerService= customerService;
	}
	
	public void setAsText(String Text) throws IllegalArgumentException{
		int id=0;
		try {
			id= Integer.parseInt(Text);
		}catch(Exception e){}
		
		Customer customer= customerService.getCustomerById(id);
	}

	
}
