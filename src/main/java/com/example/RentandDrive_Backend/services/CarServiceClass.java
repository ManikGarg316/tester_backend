package com.example.RentandDrive_Backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.RentandDrive_Backend.entities.Car;
import com.example.RentandDrive_Backend.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CarServiceClass implements CarService {

	@Autowired
	private CarRepository repo;
	
	@Override
	public String addCar(Car car) {
		// TODO Auto-generated method stub
		repo.save(car);
		return "Car saved in system successfully";
	}

	@Override
	public List<Car> getAllCars() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Car> findByCarNumber(String carNumber) {
		// TODO Auto-generated method stub
		return repo.findById(carNumber);
	}

	@Override
	public String deleteCar(String carNumber) {
		// TODO Auto-generated method stub
		repo.deleteById(carNumber);
		return "Car deleted successfully";
	}

	@Override
	public List<Car> filterByOptionalSeatsAndOptionalFuel(Integer numOfSeats, String fuel) {
		// TODO Auto-generated method stub
//		System.out.println(fuel.getClass().getSimpleName());
		if(numOfSeats == 0 && fuel.equals("null")) {
//			System.out.println("Hi 1 is running");
		return repo.findAll();
		}
		else if(numOfSeats == 0) {
//			System.out.println("Hi 2 is running");
			return repo.findByFuel(fuel);
		}
		else if(fuel.equals("null")) {
//			System.out.println("Hi 3 is running");
			return repo.findBySeats(numOfSeats);
		}
		else {
//			System.out.println("Hi 4 is running");
			return repo.findBySeatsAndFuel(numOfSeats, fuel);
		}
	}

	

}
