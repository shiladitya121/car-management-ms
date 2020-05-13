package com.example.carmanagement.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetCarResponseDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7724383403817519386L;

	private long carId;
	
	private String model;
	
	private String carImage;
	
	private String numberPlate;
}
