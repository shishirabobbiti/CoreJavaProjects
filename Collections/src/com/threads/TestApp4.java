package com.threads;

class MyThread4 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("child thread");
			Thread.yield();// line-1
		}
	}
}

public class TestApp4 {
	public static void main(String... args) {
		MyThread4 t = new MyThread4();
		t.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Parent Thread");
		}
	}
}
