package com.example.carmanagement.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetCarResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -625625351544460334L;
	
	private long customerId;
	
	private List<GetCarResponseDto> getCarResponseDtos;

}
