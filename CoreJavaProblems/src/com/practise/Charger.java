package com.practise;
class Charger{
	String brand;
	int output;
	public static void main(String[] args){
		Charger charger1=new Charger();
		Charger	charger2=new Charger();
		charger1.brand="oppo";
		charger1.output=85;
		charger2.brand="Apple";
		charger2.output=20;
		System.out.println(charger1.brand);
		System.out.println(charger1.output);	
		System.out.println(charger2.brand);
		System.out.println(charger2.output);
		charger1=null;
		System.out.println(charger1.brand);
		System.out.println(charger1.output);

	}
 	void canCharge(){
	}
}

