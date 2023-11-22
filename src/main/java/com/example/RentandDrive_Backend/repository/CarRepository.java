package com.example.RentandDrive_Backend.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.RentandDrive_Backend.entities.Car;


public interface CarRepository extends JpaRepository<Car,String> {

	List<Car> findByFuel(String fuel);
	List<Car> findBySeats(Integer numOfSeats);
	List<Car> findBySeatsAndFuel(Integer numOfSeats, String fuel);

}
