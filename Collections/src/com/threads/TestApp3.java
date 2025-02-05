package com.threads;

class MyThread3 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("child thread");
		}
	}
}

public class TestApp3 {
	public static void main(String... args) {
		MyThread3 t = new MyThread3();
		t.setPriority(7);// line -1
		t.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("main thread");
		}
	}
}
