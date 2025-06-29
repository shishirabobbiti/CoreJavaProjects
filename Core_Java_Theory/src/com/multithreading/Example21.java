package com.multithreading;

class MyThread21 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Child Thread");
	}
}

public class Example21 {

	public static void main(String[] args) throws InterruptedException {
	   
		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		MyThread21 t=new MyThread21();
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		t.start();
		System.out.println(t.isDaemon());
	}
}	
	