package com.car.rental.service;

import java.util.List;

import com.car.rental.domain.VehicleType;


public interface VehicleTypeService {
	public VehicleType searchVehicleTypeById(int id);
	public void addVehicleType(VehicleType vehicleType);
	public void deleteVehicleType(int id);
	public List<VehicleType> getAllVehicleType();
}
