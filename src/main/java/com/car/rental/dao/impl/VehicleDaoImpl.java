package com.car.rental.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.car.rental.dao.VehicleDao;
import com.car.rental.domain.Vehicle;
import com.car.rental.util.SessionUtil;
@Repository
public class VehicleDaoImpl extends SessionUtil implements VehicleDao {

	@Override
	public Vehicle searchVehicleById(int id) {
		
		return (Vehicle)getSession().get(Vehicle.class, id);
	}

	@Override
	public void addVehicle(Vehicle vehicle) {
		getSession().saveOrUpdate(vehicle);
		
	}

	@Override
	public void deleteVehicle(int id) {
		Vehicle vehicle= searchVehicleById(id);
		if(vehicle!=null){
		getSession().delete(vehicle);
		
		}
	}

	
	@Override
	public List<Vehicle> getAllVehicle() {
		
		return getSession().createQuery("From Vehicle").list();
	}

}
