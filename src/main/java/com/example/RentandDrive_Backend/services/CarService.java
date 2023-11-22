package com.example.RentandDrive_Backend.services;
import com.example.RentandDrive_Backend.entities.Car;
import java.util.List;
import java.util.Optional;

public interface CarService {
	public String addCar(Car car);
	public List<Car> getAllCars();
	public Optional<Car> findByCarNumber(String carNumber);
	public String deleteCar(String carNumber);
	public List<Car> filterByOptionalSeatsAndOptionalFuel(Integer numOfSeats, String fuel);
}
