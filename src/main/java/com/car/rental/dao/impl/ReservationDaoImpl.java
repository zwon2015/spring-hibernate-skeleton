package com.car.rental.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.car.rental.dao.ReservationDao;
import com.car.rental.domain.Reservation;
import com.car.rental.util.SessionUtil;
@Repository
public class ReservationDaoImpl extends SessionUtil implements ReservationDao{

	@Override
	public Reservation searchVehicleById(int id) {
		return (Reservation) getSession().get(Reservation.class, id);
	}

	@Override
	public void addReservation(Reservation reservation) {
		getSession().saveOrUpdate(reservation);
		
	}

	@Override
	public void deleteReservation(int id) {
		Reservation reservation= searchVehicleById(id);
		getSession().delete(reservation);
	}

	@Override
	public List<Reservation> getAllReservation() {
		return getSession().createQuery("From Reservation").list();
	}

}
