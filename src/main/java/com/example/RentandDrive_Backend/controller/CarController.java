package com.example.RentandDrive_Backend.controller;
import com.example.RentandDrive_Backend.entities.Car;
import com.example.RentandDrive_Backend.services.CarService;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CarController {
	
	@Autowired
	private CarService service;
	
	@GetMapping("/cars")
	public List<Car> getCars(@RequestParam(defaultValue = "null") String fuel, @RequestParam(defaultValue = "0") String seats)
	{
		return service.filterByOptionalSeatsAndOptionalFuel(Integer.parseInt(seats), fuel);
	}
	
	@GetMapping("/cars/{carid}")
	public Optional<Car> getCars(@PathVariable String carid)
	{
		return service.findByCarNumber(carid);
	}
	
	@PostMapping("/cars/add")
	public String saveCar(@RequestBody Car car)
	{
		return service.addCar(car);
	}
	
	@DeleteMapping("cars/delete/{carnum}")
	public String deleteCar(@PathVariable String carnum) {
		return service.deleteCar(carnum);
	}
	
}
