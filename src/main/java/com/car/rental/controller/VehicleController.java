package com.car.rental.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.car.rental.domain.Rental;
import com.car.rental.domain.Vehicle;
import com.car.rental.domain.VehicleType;
import com.car.rental.propertyeditor.VehicleTypePropertyEditor;
import com.car.rental.service.VehicleService;
import com.car.rental.service.VehicleTypeService;

@Controller
@SessionAttributes({"vehicle"})
public class VehicleController {

	@Autowired
	VehicleService vehicleService;
	
	@Autowired
	VehicleTypeService vehicleTypeService;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(VehicleType.class, new VehicleTypePropertyEditor(vehicleTypeService));
	}
	
	
	@RequestMapping("/vehicle/add")
	public String addVehicle(Model model) {

		model.addAttribute("vehicle", new Vehicle());
		model.addAttribute("vehicleTypes", vehicleTypeService.getAllVehicleType());

		return "vehicle/addVehicle";
	}
	
	@RequestMapping(value = "/vehicle/save", method = RequestMethod.POST)
	public String saveVehicle(@Valid @ModelAttribute Vehicle vehicle, BindingResult result, Model model) {

		if(result.hasErrors())
		{
			model.addAttribute("vehicleTypes", vehicleTypeService.getAllVehicleType());
			return "vehicle/addVehicle";
		}
		
		vehicleService.addVehicle(vehicle);

		return "redirect:/vehicle";
	}
	
	@RequestMapping("/vehicle")
	public String allVehicle(Model model) {

		
		model.addAttribute("vehicle", vehicleService.getAllVehicle());

		return "vehicle/allVehicle";
	}
	
	
	
}
