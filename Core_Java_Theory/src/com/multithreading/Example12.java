package com.multithreading;

class MyThread12 extends Thread{
	 @Override
	 public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Child" +i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
	 }
}


public class Example12 {

	public static void main(String[] args) throws InterruptedException {
		MyThread12 mt12=new MyThread12();
		mt12.start();
		//m10.join();
		mt12.join(5000);//main thread is asking child thread to join it before 5 seconds
		for(int i=0;i<=5;i++) {
			System.out.println("Main" +i);
			
		}
		 

		
	}
}	
	