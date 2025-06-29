package com.multithreading;

class MyThread10 extends Thread{
	 @Override
	 public void run() {
		 System.out.println("Child thread: "+Thread.currentThread().getName());
		 
	 }
}


public class Example10 {

	public static void main(String[] args) {
		MyThread10 mt10=new MyThread10();
		mt10.start();
		MyThread10 mt11=new MyThread10();
		mt11.start();
		System.out.println("main thread: "+Thread.currentThread().getName());

		
	}
}	
	