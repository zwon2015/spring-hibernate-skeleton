package com.car.rental.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.car.rental.dao.VehicleTypeDao;
import com.car.rental.domain.VehicleType;
import com.car.rental.util.SessionUtil;

@Repository
public class VehicleTypeDaoImpl extends SessionUtil implements VehicleTypeDao {

	@Override
	public VehicleType searchVehicleTypeById(int id) {
		VehicleType vehicleType = (VehicleType) getSession().get(
				VehicleType.class, id);
		return vehicleType;
	}

	@Override
	public void addVehicleType(VehicleType vehicleType) {
		getSession().saveOrUpdate(vehicleType);
	}

	@Override
	public void deleteVehicleType(int id) {
		VehicleType vehicleType = searchVehicleTypeById(id);
		if (vehicleType != null) {
			getSession().delete(vehicleType);
		}
	}

	@Override
	public List<VehicleType> getAllVehicleType() {
		
		return getSession().createQuery("From VehicleType").list();
	}

}
