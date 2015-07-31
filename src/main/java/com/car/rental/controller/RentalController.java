package com.car.rental.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.car.rental.domain.Customer;
import com.car.rental.domain.Rental;
import com.car.rental.service.RentalService;

@Controller
@SessionAttributes({"rental"})
public class RentalController {
	
	@Autowired
	RentalService rentalService;
	
	
	@InitBinder
	protected void initBinder(WebDataBinder binder)
	{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format,false));
	}
	
	@RequestMapping("/rental")
	public String allRental(Model model) {

		model.addAttribute("rental", rentalService.getAllRental());

		return "rental/listRental";
	}
	
	
	@RequestMapping("/rental/add")
	public String addRental(Model model){
		model.addAttribute("rental", new Rental());
		return "rental/addRental";
	}
	
	@RequestMapping(value = "/rental/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute Rental rental, Model model) {

		rentalService.saveRental(rental);

		return "redirect:/rental";
	}
	
	@RequestMapping("/rental/edit/{rentalId}")
	public String editCustomer(@PathVariable("rentalId") int rentalId, Model model) {

		model.addAttribute("rental", rentalService.searchRentalById(rentalId));

		return "rental/addRental";
	}
	
	@RequestMapping("/rental/delete/{rentalId}")
	public String deleteCustomer(@PathVariable("rentalId") int rentalId, Model model) {

		rentalService.deleteRental(rentalId);
		return "redirect:/rental";
	}

}
