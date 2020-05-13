package com.example.carmanagement.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carmanagement.dao.CarRepository;
import com.example.carmanagement.dto.CreateCarRequest;
import com.example.carmanagement.dto.GetCarResponse;
import com.example.carmanagement.entity.Car;
import com.example.carmanagement.mapper.CarMapper;
import com.example.carmanagement.service.CarService;

@Service
public class CarServiceImpl implements CarService{

	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private CarMapper carMapper;
	
	@Override
	@Transactional
	public void createCar(CreateCarRequest request) {
		Car car = carMapper.createCarDtoToEntityConversion(request);
		carRepository.save(car);
	}

	@Override
	public GetCarResponse retrieveActiveCars(long customerId) {
		List<Car> cars =  carRepository.findByCustomerIdAndStatus(customerId, "ACTIVE");
		GetCarResponse getCarResponse = carMapper.convertCarEntityToDto(customerId, cars);
		return getCarResponse;
	}

}
