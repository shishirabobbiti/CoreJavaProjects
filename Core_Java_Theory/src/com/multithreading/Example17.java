package com.multithreading;

class Display{
	public  synchronized void wish() {

		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName() +":"+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class MyThread17 extends Thread{
	Display d=null;
	public MyThread17(Display d) {
		this.d=d;
	}
	
	 @Override
	 public void run() {	 
		 d.wish();
		 
	 }
}



public class Example17 {

	public static void main(String[] args) throws InterruptedException {
		Display d1=new Display();
		Display d2=new Display();
		Display d3=new Display();
		//3 threads creation but one display object
//		MyThread17 t1=new MyThread17(d1);
//		MyThread17 t2=new MyThread17(d1);
//		MyThread17 t3=new MyThread17(d1);
		
		//3 threads creation for 3 display objects
		MyThread17 t1=new MyThread17(d1);
		MyThread17 t2=new MyThread17(d2);
		MyThread17 t3=new MyThread17(d3);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("End of main");
		
		
		
	}
}	
	