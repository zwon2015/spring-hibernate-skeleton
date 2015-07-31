package com.car.rental.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.car.rental.domain.Customer;
import com.car.rental.service.CustomerService;

@Controller
@SessionAttributes({ "customer" })
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping("/customer")
	public String allCustomers(Model model) {

		model.addAttribute("customers", customerService.getAllCustomer());

		return "customer/listCustomer";
	}

	@RequestMapping("/customer/add")
	public String addCustomer(Model model) {

		model.addAttribute("customer", new Customer());

		return "customer/addCustomer";
	}

	@RequestMapping(value = "/customer/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute Customer customer, Model model) {

		customerService.saveCustomer(customer);

		return "redirect:/customer";
	}
	
	@RequestMapping("/customer/edit/{cusId}")
	public String editCustomer(@PathVariable("cusId") int cusId, Model model) {

		model.addAttribute("customer", customerService.getCustomerById(cusId));

		return "customer/addCustomer";
	}
	
	@RequestMapping("/customer/delete/{cusId}")
	public String deleteCustomer(@PathVariable("cusId") int cusId, Model model) {

		customerService.deleteCustomer(cusId);
		return "redirect:/customer";
	}

}
