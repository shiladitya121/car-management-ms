package com.example.carmanagement.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateCarRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1781054018186155002L;

	private String model;
	
	private int customerId;
	
	private String carImage;
	
	private String numberPlate;

}
