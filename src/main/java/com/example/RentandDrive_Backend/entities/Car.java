package com.example.RentandDrive_Backend.entities;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cars")
public class Car {
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "car_number")
	@Size(min = 6, max=20)
	private String carNumber;
	
	@Column(name = "car_model")
	private String model;
	
	@Column(name = "car_make")
	private String make;
	
	@Column(name = "rate_per_day")
	private Integer ratePerDay;
	
	@Column(name = "num_of_seats")
	private Integer seats;
	
	@Column(name = "pincode")
	private Integer pincode;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "mileage")
	private Float mileage;
	
	@Column(name = "transmission")
	private String type;
	
	@Column(name = "fuel_type")
	private String fuel;
	
	public Car(@Size(min = 6, max = 20) String carNumber, String model, String make, Integer ratePerDay, Integer seats,
			Integer pincode, String city, Float mileage, String type, String fuel) {
		super();
		this.carNumber = carNumber;
		this.model = model;
		this.make = make;
		this.ratePerDay = ratePerDay;
		this.seats = seats;
		this.pincode = pincode;
		this.city = city;
		this.mileage = mileage;
		this.type = type;
		this.fuel = fuel;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Integer getRatePerDay() {
		return ratePerDay;
	}

	public void setRatePerDay(Integer ratePerDay) {
		this.ratePerDay = ratePerDay;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Float getMileage() {
		return mileage;
	}

	public void setMileage(Float mileage) {
		this.mileage = mileage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFuelType() {
		return fuel;
	}

	public void setFuelType(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", model=" + model + ", make=" + make + ", ratePerDay=" + ratePerDay
				+ ", seats=" + seats + ", pincode=" + pincode + ", city=" + city + ", mileage=" + mileage + ", type="
				+ type + ", fuelType=" + fuel+ "]";
	}
	
//   @Id
//   @GeneratedValue
//   private long id;
//   private String model;
//   private String brand;
//public Car(long id, String model, String brand) {
//	super();
//	this.id = id;
//	this.model = model;
//	this.brand = brand;
//}
//public Car() {
//	super();
//}
//public long getId() {
//	return id;
//}
//public void setId(long id) {
//	this.id = id;
//}
//public String getModel() {
//	return model;
//}
//public void setModel(String model) {
//	this.model = model;
//}
//public String getBrand() {
//	return brand;
//}
//public void setBrand(String brand) {
//	this.brand = brand;
//}
//@Override
//public String toString() {
//	return "Car [id=" + id + ", model=" + model + ", brand=" + brand + "]";
//}
   
}
