package com.practise;

class Hyundai {
	static int noOfWheels;
	static boolean isRadio;
	private String model;
	private String fuel;
	private String color;
	static {
		noOfWheels = 4;
		isRadio = true;
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Block executed");
	}

	public Hyundai() {
		System.out.println("Hyundai.Hyundai() parameterless");
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void setFuel(String fuel) {
		this.fuel=fuel;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getModel() {
		return model;
	}
	public String getFuel() {
		return fuel;
	}
	public String getColor() {
		return color;
	}

	public Hyundai(String model, String fuel,String color) {
		this();
		this.model = model;
		this.fuel = fuel;
		this.color=color;
		System.out.println("Hyundai.Hyundai() parameterized");
	}
	public void describe() {
		System.out.println("Car is "+ model);
		System.out.println("Car having "+ noOfWheels+" wheels");
		if(isRadio==true) {
			System.out.println("Car has Radio");		
		}
		else {
			System.out.println("Car has No Radio");

		}
		System.out.println("Car runs on "+fuel);
		System.out.println("Car color is " +color);
	}
}

public class Theory_4_Class_Object {

	public static void main(String[] args) {

		Hyundai grandI10 = new Hyundai("GrandI10", "Petrol","Red");
		Hyundai creta = new Hyundai("Creta", "Diesel","White");
		Hyundai venue = new Hyundai("Venue", "Petrol","Green");
		
		venue.describe();
	}

}
