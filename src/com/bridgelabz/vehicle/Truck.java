package com.bridgelabz.vehicle;

/*
 * Truck class extending Vehicle.
 */

public class Truck extends Vehicle {

	private double loadCapacity;

	// Parameterized Constructor
	public Truck(String registrationNumber, String brand,
			String fuelType, double loadCapacity) {

		super(registrationNumber, brand, fuelType);

		this.loadCapacity = loadCapacity;
	}

	@Override
	public void displayDetails() {

		super.displayDetails();

		System.out.println("Load Capacity : " + loadCapacity + " Tons");
	}
}