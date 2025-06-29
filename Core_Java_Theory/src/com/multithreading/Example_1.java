package com.multithreading;

class MyThread1 extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Child::"+i);
		}
	}
	
}

public class Example_1 {

	public static void main(String[] args) {
		
		MyThread1 mt1=new MyThread1();
		mt1.start();
		//ThreadScheduler
		//2 threads->main,child(MyThread)
		for(int i=1;i<=10;i++) {
			System.out.println("Main::"+i);
		}

	}

}
