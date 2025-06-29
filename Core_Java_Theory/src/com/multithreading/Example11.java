package com.multithreading;

class MyThread11 extends Thread{
	 @Override
	 public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Child" +i);
		}
		 
	 }
}


public class Example11 {

	public static void main(String[] args) {
		MyThread11 mt11=new MyThread11();
		
		System.out.println("Main Thread priority :"+Thread.currentThread().getPriority());
		System.out.println("Child Thread priority :"+mt11.getPriority());
		System.out.println("******New Priority : Main Thread**********");
		Thread.currentThread().setPriority(1);
		System.out.println("Main Thread priority :"+Thread.currentThread().getPriority());
		System.out.println("Child Thread priority :"+mt11.getPriority());
		mt11.start();
		for(int i=0;i<=10;i++) {
			System.out.println("Main" +i);
		}
		 

		
	}
}	
	