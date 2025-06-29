package com.practise;

class Employee{
	public void bikesOwn() {
		System.out.println("Employee having single bike");
	}
	public void bikesOwn(int bike) {
				System.out.println("Employee having "+bike +"bikes");
	}
	public void bikesOwn(int bike,int scooty) {
		System.out.println("Employee having"+bike+"bike and "+scooty+"scooty");
	}
}
class Manager extends Employee {
	public void bikesOwn(int bike) {
		System.out.println("manager having no bike");
	}
	
}

public class Theory_6_Class_Polymorphism {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.bikesOwn();
		e.bikesOwn(2);
		e.bikesOwn(1, 1);
		Employee m=new Manager();
		m.bikesOwn(2);

	}

}
