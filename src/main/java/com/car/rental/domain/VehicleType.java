package com.car.rental.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity	
public class VehicleType {
	@Id
	@GeneratedValue
	private Integer vehicleTypeId;
	private String brand;
	private String make;
	private String model;
	private String type;
	
	@OneToMany(mappedBy="vehicleType")
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public Integer getVehicleTypeId() {
		return vehicleTypeId;
	}
	public void setVehicleTypeId(Integer vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	public String getFullType()
	{
		return brand + " " + make + " " + model + " " + type;
	}

}
