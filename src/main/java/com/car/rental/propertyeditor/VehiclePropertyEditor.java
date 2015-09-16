package com.car.rental.propertyeditor;

import com.car.rental.domain.Customer;
import com.car.rental.domain.Vehicle;
import com.car.rental.service.CustomerService;
import com.car.rental.service.VehicleService;

public class VehiclePropertyEditor {

	VehicleService vehicleService;

	public VehiclePropertyEditor(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}

	public void setAsText(String Text) throws IllegalArgumentException {
		int id = 0;
		try {
			id = Integer.parseInt(Text);
		} catch (Exception e) {
		}

		Vehicle vehicle = vehicleService.searchVehicleById(id);

	}
}