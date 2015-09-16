package com.car.rental.service;

import java.util.List;

import com.car.rental.domain.Reservation;

public interface ReservationService {
	public Reservation searchVehicleById(int id);
	public void addReservation(Reservation reservation);
	public void deleteReservation(int id);
	public List<Reservation> getAllReservation();
}
