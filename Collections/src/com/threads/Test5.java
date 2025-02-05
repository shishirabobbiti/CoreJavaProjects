package com.threads;

class MyThread7 extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("I am lazy thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}

public class Test5 {
	public static void main(String... args) throws InterruptedException {
		MyThread7 t = new MyThread7();
		t.start();
		//t.interrupt();// line-n1
		System.out.println("End of Main...");
	}
}
