package com.bridgelabz.vehicle;

/*
 * Car class extending Vehicle.
 */

public class Car extends Vehicle {

	private int seatingCapacity;

	// Parameterized Constructor
	public Car(String registrationNumber, String brand,
			String fuelType, int seatingCapacity) {

		super(registrationNumber, brand, fuelType);

		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public void displayDetails() {

		super.displayDetails();

		System.out.println("Seating Capacity : " + seatingCapacity);
	}
}