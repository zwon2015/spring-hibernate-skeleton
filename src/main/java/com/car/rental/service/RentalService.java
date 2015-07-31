package com.car.rental.service;

import java.util.List;

import com.car.rental.domain.Rental;

public interface RentalService {
	
	public Rental searchRentalById(int id);
	public void newRental(Rental rental);
	public void deleteRental(int id);
	public void saveRental(Rental rental);
	public List<Rental> getAllRental();
	
}
