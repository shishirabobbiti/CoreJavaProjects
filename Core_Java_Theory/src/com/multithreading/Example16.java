package com.multithreading;

class MyThread16 extends Thread{
	
	 @Override
	 public void run() {
		
		
			try {
				for(int i=0;i<=2;i++) {
					System.out.println("Child" +i);
				Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				System.out.println("I am interrupted");
			}
		
		 
	 }
}



public class Example16 {

	public static void main(String[] args) throws InterruptedException {
		MyThread16 mt16=new MyThread16();
		mt16.start();
		Thread.sleep(5000);
		mt16.interrupt();
		for(int i=0;i<=5;i++) {
			System.out.println("Main" +i);
		}
		
	}
}	
	