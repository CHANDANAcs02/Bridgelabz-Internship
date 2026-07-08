package com.bridgelabz.vehicle;

/*
 * Bike class extending Vehicle.
 */

public class Bike extends Vehicle {

	private int engineCapacity;

	// Parameterized Constructor
	public Bike(String registrationNumber, String brand,
			String fuelType, int engineCapacity) {

		super(registrationNumber, brand, fuelType);

		this.engineCapacity = engineCapacity;
	}

	@Override
	public void displayDetails() {

		super.displayDetails();

		System.out.println("Engine Capacity : " + engineCapacity + " cc");
	}
}