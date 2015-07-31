package com.car.rental.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.car.rental.dao.VehicleTypeDao;
import com.car.rental.domain.VehicleType;
import com.car.rental.service.VehicleTypeService;

@Service
@Transactional
public class VehicleTypeServiceImpl implements VehicleTypeService{

	@Autowired
	VehicleTypeDao vehicleTypeDao;
	
	@Override
	public VehicleType searchVehicleTypeById(int id) {
		return vehicleTypeDao.searchVehicleTypeById(id);
	}

	@Override
	public void addVehicleType(VehicleType vehicleType) {
		vehicleTypeDao.addVehicleType(vehicleType);
	}

	@Override
	public void deleteVehicleType(int id) {
		vehicleTypeDao.deleteVehicleType(id);
	}

	@Override
	public List<VehicleType> getAllVehicleType() {
		return vehicleTypeDao.getAllVehicleType();
	}

}
