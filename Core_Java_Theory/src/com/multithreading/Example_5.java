package com.multithreading;

class MyThread5 extends Thread {

	@Override
	public void run() {
		System.out.println("No arg run()");
	}

}

public class Example_5 {

	public static void main(String[] args) {

		MyThread5 mt5 = new MyThread5();
		mt5.start();
		mt5.start();
	}

}
