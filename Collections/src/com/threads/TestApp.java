package com.threads;

class MyThread extends Thread {
}

public class TestApp {
	public static void main(String... args) {
		System.out.println(Thread.currentThread().getName());// main
		MyThread t = new MyThread();
		t.start();
		System.out.println(t.getName());// Thread-0
		Thread.currentThread().setName("Yash");// Yash
		System.out.println(Thread.currentThread().getName());// Yash
		System.out.println(10 / 0);
		// Exception in thread "yash" java.lang.ArithmeticException:/by zero
		TestApp.main();
	}
}
