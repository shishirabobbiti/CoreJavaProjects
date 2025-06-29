package com.multithreading;

class MyThread9 extends Thread{
	 @Override
	 public void run() {
		 
	 }
}


public class Example9 {

	public static void main(String[] args) {
		MyThread9 mt9=new MyThread9();
		mt9.start();
		System.out.println("m10 name:"+ mt9.getName());
		System.out.println("main thread: "+Thread.currentThread().getName());
		mt9.setName("Child");
		Thread.currentThread().setName("Parent");
		System.out.println("*************************************");
		System.out.println(mt9.getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println("*************************************");
		System.out.println(10/0);
		
	}
}	
	