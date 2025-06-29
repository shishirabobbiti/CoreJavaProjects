package com.multithreading;

class MyThread22 extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Example22 {

	public static void main(String[] args) throws InterruptedException {
	   
		MyThread22 t=new MyThread22();
		t.setDaemon(true);
		t.start();
		Thread.sleep(5000);
		System.out.println("End of Main Thread");
	}
}	
	