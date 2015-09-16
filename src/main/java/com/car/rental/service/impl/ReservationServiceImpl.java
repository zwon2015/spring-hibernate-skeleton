package com.car.rental.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.car.rental.dao.ReservationDao;
import com.car.rental.domain.Reservation;
import com.car.rental.service.ReservationService;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService{
	
	@Autowired
	ReservationDao reservationDao;
	
	
	@Override
	public Reservation searchVehicleById(int id) {
		return reservationDao.searchVehicleById(id);
	}

	@Override
	public void addReservation(Reservation reservation) {
		reservationDao.addReservation(reservation);
	}

	@Override
	public void deleteReservation(int id) {
		reservationDao.deleteReservation(id);
	}

	@Override
	public List<Reservation> getAllReservation() {
		return reservationDao.getAllReservation();
	}

}
