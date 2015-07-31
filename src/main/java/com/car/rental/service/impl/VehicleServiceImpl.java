package com.car.rental.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.car.rental.dao.VehicleDao;
import com.car.rental.domain.Vehicle;
import com.car.rental.service.VehicleService;


@Service
@Transactional
public class VehicleServiceImpl implements VehicleService{
	
	@Autowired
	VehicleDao	vehicleDao;
	
	@Override
	public Vehicle searchVehicleById(int id) {
		return vehicleDao.searchVehicleById(id);
	}

	@Override
	public void addVehicle(Vehicle vehicle) {
		vehicleDao.addVehicle(vehicle);
	}

	@Override
	public void deleteVehicle(int id) {
		vehicleDao.deleteVehicle(id);
	}

	@Override
	public List<Vehicle> getAllVehicle() {
		return vehicleDao.getAllVehicle();
	}
	
}
