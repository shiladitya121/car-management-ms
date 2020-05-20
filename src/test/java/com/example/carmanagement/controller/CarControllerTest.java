package com.example.carmanagement.controller;

import static org.mockito.Mockito.doNothing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.carmanagement.dto.CreateCarRequest;
import com.example.carmanagement.service.CarService;

@ExtendWith(SpringExtension.class)
public class CarControllerTest {

	@InjectMocks
	private CarController carController;
	
	@Mock
	private CarService carService;
	
	@Test
	public void testCreateCar() {
		CreateCarRequest request = new CreateCarRequest();
		request.setCustomerId(123456789l);
		request.setModel("Hyundai Creta");
		request.setNumberPlate("TS 29 AL 1234");
		request.setCarImage("http://aws/s3/car_bucket/car_image_1001");
		
		doNothing().when(carService).createCar(request);
		
		Assertions.assertEquals(carController.createCar(request).getStatusCode(), HttpStatus.CREATED);
	}
}
