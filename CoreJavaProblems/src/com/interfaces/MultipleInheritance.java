package com.interfaces; 
interface IBMW{
	int a=10;
	void cost();
}
interface IAudi{
	int a=20;
	void powerOfEngine();
	void cost();
}

class Vehicle{

	int vehicleNo;
	int eNo;
	public Vehicle(int x,int y){
		vehicleNo=x;
		eNo=y;
	}
}

class Car extends Vehicle implements IBMW,IAudi {

	public Car(int x,int y){
		super(x,y);
	}
	//a=20;
	public void printA(){
		System.out.println("IBMW value is:"+IBMW.a);
		System.out.println("AUDI value is:"+IAudi.a);
	}

	public void cost(){
		System.out.println("50 lakhs");
	}

//	public String cost(){
//		System.out.println("50 lakhs");
//		return null;
//	}

	public void powerOfEngine(){
		System.out.println("High Speed");
	}
}



public class MultipleInheritance{
		public static void main(String[] args){
		Car c=new Car(1000,6534);
		System.out.println("Vehicle No:"+c.vehicleNo);
		System.out.println("Engine No:"+c.eNo);
		c.printA();
		c.cost();
		c.powerOfEngine();	
		}


}