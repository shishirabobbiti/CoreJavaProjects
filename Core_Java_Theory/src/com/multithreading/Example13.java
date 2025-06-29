package com.multithreading;

class MyThread13 extends Thread{
	 @Override
	 public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Child" +i);
			Thread.yield();//waiting state
		}
		 
	 }
}


public class Example13 {

	public static void main(String[] args) {
		MyThread13 mt13=new MyThread13();
		mt13.start();//child:1
		for(int i=0;i<=5;i++) {
			System.out.println("Main" +i);
		}
		 

		
	}
}	
	