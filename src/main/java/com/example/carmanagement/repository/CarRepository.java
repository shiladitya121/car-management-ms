package com.example.carmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.carmanagement.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

	@Query("FROM Car c WHERE c.customerId = ?1 AND c.status = ?2")
	public List<Car> findByCustomerIdAndStatus(long customerId, String status);
}
