package com.example.carmanagement.service;

import com.example.carmanagement.dto.CreateCarRequest;
import com.example.carmanagement.dto.GetCarResponse;

public interface CarService {

	public void createCar(CreateCarRequest request);

	public GetCarResponse retrieveActiveCars(long customerId);
}
