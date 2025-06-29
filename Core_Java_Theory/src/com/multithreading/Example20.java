package com.multithreading;

class MyThread20 extends Thread{
	int total=0;
	
	 @Override
	 public void run() {	 
		 //child thread
		 synchronized(this) {
			 System.out.println("Child thread started calculation");
			 for(int i=0;i<100;i++) {
				 total=total+i;
			 }
			System.out.println("Child Thread notifying main thread");
			this.notify();
		 }
		 
		 
	 }
}



public class Example20 {

	public static void main(String[] args) throws InterruptedException {
	   
		MyThread20 t= new MyThread20();
		t.start();
		//Thread.sleep(1000);
		//main thread
		synchronized(t) {
			System.out.println("Main Thread is calling wait on child thread");
			t.wait();
			Thread.sleep(10000);
			System.out.println("Main thread got notified");
			System.out.println(t.total);
		}
		
	}
}	
	