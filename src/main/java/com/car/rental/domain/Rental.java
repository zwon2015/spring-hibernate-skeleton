package com.car.rental.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Rental {
	@Id
	@GeneratedValue
	private Integer rentalId;
	private Date startDate;
	private Date maxDuration;
	private Date endDate;
	
	@OneToOne
	private Customer customer;
	@OneToOne
	private Vehicle vehicle;
	
	
	public Integer getRentalId() {
		return rentalId;
	}
	public void setRentalId(Integer rentalId) {
		this.rentalId = rentalId;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getMaxDuration() {
		return maxDuration;
	}
	public void setMaxDuration(Date maxDuration) {
		this.maxDuration = maxDuration;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	


}
