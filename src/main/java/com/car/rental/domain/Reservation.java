package com.car.rental.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Reservation {
	@Id
	@GeneratedValue
	private Integer reservationId;
	private Date reservedDate;
	public Integer getReservationId() {
		return reservationId;
	}
	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}
	public Date getReservedDate() {
		return reservedDate;
	}
	public void setReservedDate(Date reservedDate) {
		this.reservedDate = reservedDate;
	}
	
	

}
