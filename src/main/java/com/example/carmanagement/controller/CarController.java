package com.example.carmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carmanagement.dto.CreateCarRequest;
import com.example.carmanagement.dto.GetCarResponse;
import com.example.carmanagement.service.CarService;

@RestController
@RequestMapping("/api/car-management/v1")
public class CarController {

	@Autowired
	private CarService carService;
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> createCar(@RequestBody CreateCarRequest request) {
		carService.createCar(request);
		return new ResponseEntity<>("SUCCESS", HttpStatus.CREATED);
		
	}
	
	@GetMapping(path = "/active/{customerId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GetCarResponse> retrieveActiveCars(@PathVariable long customerId){
		GetCarResponse carResponse = carService.retrieveActiveCars(customerId);
		return new ResponseEntity<>(carResponse, HttpStatus.OK);
	}
}
