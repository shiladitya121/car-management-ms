package com.example.carmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "car_management", name = "t_car")
@Setter
@Getter
public class Car {
	
	@Id
	@Column(name = "car_id")
	private long carId;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "customer_id")
	private long customerId;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "car_image")
	private String carImage;
	
	@Column(name = "number_plate")
	private String numberPlate;
	
}
