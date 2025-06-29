package com.multithreading;

class MyThread2 extends Thread {

	@Override
	public void run() {
		System.out.println("No arg run()");
		//run(2);
	}
	
	public static void run(int i) {
		System.out.println("Arg run()");
	}

}

public class Example_2 {

	public static void main(String[] args) {

		MyThread2 mt2 = new MyThread2();
		mt2.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main: " + i);
		}

	}

}
