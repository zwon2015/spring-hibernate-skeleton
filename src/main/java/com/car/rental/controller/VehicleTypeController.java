package com.car.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.car.rental.domain.VehicleType;
import com.car.rental.service.VehicleService;
import com.car.rental.service.VehicleTypeService;

@Controller
@SessionAttributes({"vehicleType"})
public class VehicleTypeController {
	
	@Autowired
	VehicleTypeService vehicleTypeService;
	

	@RequestMapping("/vehicleType/add")
	public String addVehicleType(Model model) {

		model.addAttribute("vehicleType", new VehicleType());

		return "vehicleType/addVehicleType";
	}
	
	@RequestMapping(value="vehicleType/save",method=RequestMethod.POST)
	public String addVehicleType(@ModelAttribute VehicleType vehicleType, Model model) {

		vehicleTypeService.addVehicleType(vehicleType);

		return "redirect:/vehicleType";
	}
	
	@RequestMapping("/vehicleType")
	public String allVehicleType(Model model) {

		model.addAttribute("vehicleTypes", vehicleTypeService.getAllVehicleType());

		return "vehicleType/allVehicleType";
	}
	@RequestMapping("/vehicleType/edit/{vehicleTypeId}")
	public String editCustomer(@PathVariable("vehicleTypeId") int vehicleTypeId, Model model) {

		model.addAttribute("vehicleType", vehicleTypeService.searchVehicleTypeById(vehicleTypeId));

		return "vehicleType/addVehicleType";
	}
	
	@RequestMapping("/vehicleType/delete/{vehicleTypeId}")
	public String deleteCustomer(@PathVariable("vehicleTypeId") int vehicleTypeId, Model model) {

		vehicleTypeService.deleteVehicleType(vehicleTypeId);
		return "redirect:/vehicleType";
	}
	
	
}
