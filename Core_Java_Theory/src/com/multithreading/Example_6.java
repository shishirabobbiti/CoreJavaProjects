package com.multithreading;

class MyThread6 implements Runnable {

	@Override
	public void run() {
		System.out.println("Child Thread");
	}

	

}

public class Example_6 {

	public static void main(String[] args) {

		MyThread6 mt6=new MyThread6(); 
		Thread t1=new Thread(mt6);
		t1.start();
		Thread t2=new Thread(mt6);
		t2.start();
		System.out.println("Main Thread");
	}

}
