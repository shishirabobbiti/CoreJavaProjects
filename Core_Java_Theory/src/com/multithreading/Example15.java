package com.multithreading;

class MyThread15 extends Thread{
	
	static Thread pt;
	 @Override
	 public void run() {
		 try {
			pt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<=5;i++) {
			System.out.println("Child" +i);
		}
		 
	 }
}



public class Example15 {

	public static void main(String[] args) throws InterruptedException {
		MyThread15.pt= Thread.currentThread();
		MyThread15 mt15=new MyThread15();
		mt15.start();
		mt15.join();
		for(int i=0;i<=5;i++) {
			System.out.println("Main" +i);
		}
		
	}
}	
	