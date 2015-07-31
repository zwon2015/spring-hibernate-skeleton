package com.car.rental.propertyeditor;

import java.beans.PropertyEditorSupport;

import com.car.rental.domain.VehicleType;
import com.car.rental.service.VehicleTypeService;

public class VehicleTypePropertyEditor extends PropertyEditorSupport {

	VehicleTypeService vehicleTypeService;

	public VehicleTypePropertyEditor(VehicleTypeService vehicleTypeService) {
		this.vehicleTypeService = vehicleTypeService;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		int id = 0;
		try {
			id = Integer.parseInt(text);
		}catch(Exception e){}
		
		VehicleType type = vehicleTypeService.searchVehicleTypeById(id);
		
		setValue(type);
		
	}
	
	
	
	
}
