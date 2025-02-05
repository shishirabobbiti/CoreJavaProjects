package com.threads;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++)
			System.out.println("child thread");
	}
}

public class ThreadDemo {
	public static void main(String... args) throws InterruptedException {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);// call MyRunnable run()
		t.start();
		//Thread.sleep(1000);
		for (int i = 1; i <= 10; i++) {
			System.out.println("main thread");
			Thread.sleep(500);
			}
		
	}
}
