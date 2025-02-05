package com.practise;
class Calculator1{

	int x;
	int y;

	void add(){
		System.out.println("Addition::"+(x+y));
	}
	
	void sub(){
		System.out.println("Substraction::"+(x-y));
	}

	void mul(){
		System.out.println("Multiplication::"+(x*y));
	}

	void div(){
		System.out.println("Division::"+(x/y));
	}

}


public class Program12{
	
	public static void main(String[] args){
	
	Calculator1 c1=new Calculator1();
	c1.x=10;
	c1.y=30;

	Calculator1 c2=new Calculator1();
	c2.x=33;
	c2.y=44;

	c1.add();
	c2.mul();	
		
	}

}