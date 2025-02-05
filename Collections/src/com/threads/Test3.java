package com.threads;

class MyThread5 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Sita Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class Test3 {
	public static void main(String... args) throws InterruptedException {
		MyThread5 t = new MyThread5();
		t.start();
		t.join(10000);// line-n1
		for (int i = 1; i <= 10; i++) {
			System.out.println("rama thread");
		}
	}
}
