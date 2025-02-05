package com.superkeyword;

public class Car extends Vehicle{
	
	int noOfMirros;
	String color;
	
	public Car() {
		super();
		System.out.println("Car.Car()");
	}

	public Car(int noOfMirros) {
		super("Maruti");
		this.noOfMirros = noOfMirros;
		System.out.println("Car.Car(noOfMirros)");
	}

	public Car(int noOfMirros, String color) {
		super("Maruti",2);
		this.noOfMirros = noOfMirros;
		this.color = color;
		System.out.println("Car.Car(noOfMirros,color)");
	}
	

}
