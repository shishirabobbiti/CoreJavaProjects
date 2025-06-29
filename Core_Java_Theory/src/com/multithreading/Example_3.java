package com.multithreading;

class MyThread3 extends Thread {

	@Override
	public void run() {
		System.out.println("No arg run()");
		//run(2);
	}
	
	@Override
	public void start() {
		System.out.println("No arg start()");
	}

}

public class Example_3 {

	public static void main(String[] args) {

		MyThread3 mt3 = new MyThread3();
		mt3.start();
		

	}

}
