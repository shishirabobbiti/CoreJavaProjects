package com.multithreading;

class MyThread14 extends Thread{
	
	static Thread pt;
	 @Override
	 public void run() {
		 try {
			pt.join();//2 threads:child,main...child thread saying main thread that i'll wait for you to complete then join me
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<=5;i++) {
			System.out.println("Child" +i);
		}
		 
	 }
}



public class Example14 {

	public static void main(String[] args) {
		MyThread14.pt= Thread.currentThread();
		MyThread14 mt14=new MyThread14();
		mt14.start();
		for(int i=0;i<=5;i++) {
			System.out.println("Main" +i);
		}
		
	}
}	
	