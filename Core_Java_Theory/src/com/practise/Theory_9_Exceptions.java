package com.practise;

import java.io.IOException;

class Div{
	
	public void add() throws InterruptedException {
		Thread.sleep(2000);
		try {
			int a=10;
			int div=a/0;
		}
		catch(ArithmeticException e) {
			//System.out.println("Exception Handled");
			throw new ArithmeticException();
		}
		finally {
			System.out.println("Finally executed");
		}
	}
}


public class Theory_9_Exceptions {

	public static void main(String[] args) throws InterruptedException{

		//try,catch,throw,throws
		Div d=new Div();
		
		try{
			d.add();
		}
		catch(Exception e) {
			System.out.println("Exception handled in main()");
		}
		finally {
			System.out.println("Finally in main");
		}

	}
}
