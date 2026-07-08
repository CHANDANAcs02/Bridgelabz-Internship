package com.bridgelabz.vehicle;

/*
 * Driver class to demonstrate
 * Vehicle Management System.
 */

public class VehicleApplication {

	public static void main(String[] args) {

		Car car = new Car(
				"KA01AB1234",
				"Hyundai",
				"Petrol",
				5);

		Bike bike = new Bike(
				"KA05CD5678",
				"Royal Enfield",
				"Petrol",
				350);

		Truck truck = new Truck(
				"KA09EF7890",
				"Tata",
				"Diesel",
				18);

		System.out.println("----- Car Details -----");

		car.displayDetails();

		car.start();

		car.stop();

		System.out.println();

		System.out.println("----- Bike Details -----");

		bike.displayDetails();

		bike.start();

		bike.stop();

		System.out.println();

		System.out.println("----- Truck Details -----");

		truck.displayDetails();

		truck.start();

		truck.stop();
	}
}