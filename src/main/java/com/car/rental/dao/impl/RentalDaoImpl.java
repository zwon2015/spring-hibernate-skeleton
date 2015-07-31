package com.car.rental.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.car.rental.dao.RentalDao;
import com.car.rental.domain.Rental;
import com.car.rental.util.SessionUtil;

@Repository
public class RentalDaoImpl extends SessionUtil implements RentalDao{

	@Override
	public void newRental(Rental rental) {
		getSession().saveOrUpdate(rental);
	}

	@Override
	public void deleteRental(int id) {
		Rental rental= searchRentalById(id);
		if(rental!=null){
			getSession().delete(rental);
		}
	}

	@Override
	public Rental searchRentalById(int id) {
		return (Rental) getSession().get(Rental.class,id);
		
	}

	@Override
	public void saveRental(Rental rental) {
		getSession().saveOrUpdate(rental);
	}

	@Override
	public List<Rental> getAllRental() {
		return getSession().createQuery("From Rental").list();
	}

	
}
