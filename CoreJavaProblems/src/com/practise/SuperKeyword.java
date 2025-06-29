package com.practise;
class Parent3{

	static String p="Parent";

	public Parent3(){
		System.out.println("Parent Constructor");
	}

}

class Child extends Parent3{

	public void getText(){
		System.out.println("super: " +super.p);
		System.out.println("ClassName: " + Parent3.p);
	}

	public Child(){
		super();
		System.out.println("Child Construtor");
	}

}


public class SuperKeyword{

	public static void main(String[] maruthi){
		Child c=new Child();
		c.getText();
	}

}
//this->to distinguish b/w instance vs local variables
//this()->to call same class constructor
//super->to call parent class properties
//super()->to call parent class constructor