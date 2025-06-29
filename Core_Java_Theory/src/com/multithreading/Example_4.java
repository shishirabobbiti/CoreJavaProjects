package com.multithreading;

class MyThread4 extends Thread {

	@Override
	public void run() {
		System.out.println("No arg run()");
	}
	
	@Override
	public void start() {
		super.start();
		System.out.println("No arg start()");
	}

}

public class Example_4 {

	public static void main(String[] args) {

		MyThread4 mt4 = new MyThread4();
		mt4.start();
		

	}

}
