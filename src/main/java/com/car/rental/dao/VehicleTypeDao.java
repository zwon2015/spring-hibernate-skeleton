package com.car.rental.dao;

import java.util.List;

import com.car.rental.domain.VehicleType;

public interface VehicleTypeDao {
	
	public VehicleType searchVehicleTypeById(int id);
	public void addVehicleType(VehicleType vehicleType);
	public void deleteVehicleType(int id);
	public List<VehicleType> getAllVehicleType();

}
