package com.inheritance;
class Parent{

	String firstName;
	String lastName;

	public Parent(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public void printFullName(){
		System.out.println("Parent::"+firstName+" "+lastName);
	}

}


class Child extends Parent{

	public Child(String firstName,String lastName){
		super(firstName,lastName);
	}
	
	@Override
	public void printFullName(){
		System.out.println("Child::"+firstName+" "+lastName);
	}

}

public class Inheritance{

	public static void main(String[] shishira){

		Parent p=new Parent("Prabhakar","Bobbiti");
		p.printFullName();

		Child c=new Child("Priyanka","Bobbiti");
		c.printFullName();

		Parent p1=new Child("Shishira","Bobbiti");
		p1.printFullName();
			
	}

}