package com.bridgelabz.vehicle;

/*
 * Parent class representing a Vehicle.
 */

public class Vehicle {

	protected String registrationNumber;
	protected String brand;
	protected String fuelType;

	// Parameterized Constructor
	public Vehicle(String registrationNumber, String brand, String fuelType) {

		this.registrationNumber = registrationNumber;
		this.brand = brand;
		this.fuelType = fuelType;
	}

	// Start vehicle
	public void start() {

		System.out.println("Vehicle Started.");
	}

	// Stop vehicle
	public void stop() {

		System.out.println("Vehicle Stopped.");
	}

	// Display common details
	public void displayDetails() {

		System.out.println("Registration Number : " + registrationNumber);
		System.out.println("Brand : " + brand);
		System.out.println("Fuel Type : " + fuelType);
	}
}