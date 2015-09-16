package com.car.rental.dao;

import java.util.List;

import com.car.rental.domain.Reservation;
import com.car.rental.domain.Vehicle;

public interface ReservationDao {
	
	public Reservation searchVehicleById(int id);
	public void addReservation(Reservation reservation);
	public void deleteReservation(int id);
	public List<Reservation> getAllReservation();

}
