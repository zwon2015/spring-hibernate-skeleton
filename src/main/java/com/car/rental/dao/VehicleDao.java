package com.car.rental.dao;

import java.util.List;

import com.car.rental.domain.Vehicle;

public interface VehicleDao {
	public Vehicle searchVehicleById(int id);
	public void addVehicle(Vehicle vehicle);
	public void deleteVehicle(int id);
	public List<Vehicle> getAllVehicle();
}
