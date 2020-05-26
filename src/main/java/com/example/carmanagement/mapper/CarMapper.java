package com.example.carmanagement.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.carmanagement.dto.CreateCarRequest;
import com.example.carmanagement.dto.GetCarResponse;
import com.example.carmanagement.dto.GetCarResponseDto;
import com.example.carmanagement.entity.Car;
import com.example.carmanagement.utils.IdGenerator;

@Component
public class CarMapper {
	
	public Car createCarDtoToEntityConversion(CreateCarRequest request) {
		Car car = new Car();
		car.setCarId(IdGenerator.nextId());
		car.setCustomerId(request.getCustomerId());
		car.setModel(request.getModel());
		car.setNumberPlate(request.getNumberPlate());
		car.setCarImage(request.getCarImage());
		car.setStatus("ACTIVE");
		return car;
	}

	public GetCarResponse convertCarEntityToDto(long customerId, List<Car> cars) {
		GetCarResponse carResponse = new GetCarResponse();
		carResponse.setCustomerId(customerId);
		List<GetCarResponseDto> carResponseDtos = new ArrayList<>();
		GetCarResponseDto carResponseDto = null;
		for (Car car : cars) {
			carResponseDto = new GetCarResponseDto();
			carResponseDto.setCarId(car.getCarId());
			carResponseDto.setModel(car.getModel());
			carResponseDto.setNumberPlate(car.getNumberPlate());
			carResponseDto.setCarImage(car.getCarImage());
			carResponseDtos.add(carResponseDto);
		}
		carResponse.setGetCarResponseDtos(carResponseDtos);
		return carResponse;
	}
}
