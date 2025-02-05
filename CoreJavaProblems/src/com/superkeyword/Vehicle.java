package com.superkeyword;

public class Vehicle{
	
	String brand;
	int noOfLights;
	
	public Vehicle() {
		super();
		System.out.println("Vehicle.Vehicle()");
	}
	
	public Vehicle(String brand) {
		this();
		this.brand = brand;
		System.out.println("Vehicle.Vehicle(brand)");
	}

	public Vehicle(String brand, int noOfLights) {
		this("Maruti");
		this.brand = brand;
		this.noOfLights = noOfLights;
		System.out.println("Vehicle.Vehicle(brand,noOfLights)");
	}

}
