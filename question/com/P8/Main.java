package com.P8;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(20,50);
		vehicle.move();
		System.out.println(vehicle);
		vehicle.setSpeed(25);
		System.out.println(vehicle);
		vehicle.speedUp();
		System.out.println(vehicle);
		vehicle.speedDown();
		System.out.println(vehicle);
	}

}
