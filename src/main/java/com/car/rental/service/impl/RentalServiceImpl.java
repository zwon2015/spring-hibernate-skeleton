package com.car.rental.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.car.rental.dao.RentalDao;
import com.car.rental.domain.Rental;
import com.car.rental.service.RentalService;
@Service
@Transactional
public class RentalServiceImpl implements RentalService{

	@Autowired
	RentalDao rentalDao;
	
	@Override
	public Rental searchRentalById(int id) {
		return rentalDao.searchRentalById(id);
	}

	@Override
	public void newRental(Rental rental) {
		rentalDao.newRental(rental);
	}

	@Override
	public void deleteRental(int id) {
		rentalDao.deleteRental(id);
	}

	@Override
	public void saveRental(Rental rental) {
		rentalDao.saveRental(rental);
	}

	@Override
	public List<Rental> getAllRental() {
		return rentalDao.getAllRental();
	}

}
