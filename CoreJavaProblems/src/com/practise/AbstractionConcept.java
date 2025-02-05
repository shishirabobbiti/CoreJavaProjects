package com.practise;
abstract class Parent{

	//abstract int a=10;

	public abstract void play();
	
	final public void eat(){
		System.out.println("Eat");
	}

}

abstract class Child1 extends Parent{
	//public void play(){
	//}
}

class Child2 extends Parent{
	public void play(){
	}
}


public class AbstractionConcept{

	public static void main(String[] args){
		//Child1 c1=new Child1();
		Child2 c2=new Child2();

		//c1.eat();
		c2.eat();
	}

}