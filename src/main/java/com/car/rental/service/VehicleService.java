package com.car.rental.service;

import java.util.List;

import com.car.rental.domain.Vehicle;

public interface VehicleService {
	public Vehicle searchVehicleById(int id);
	public void addVehicle(Vehicle vehicle);
	public void deleteVehicle(int id);
	public List<Vehicle> getAllVehicle();
}
