package com.multithreading;


class MyThread18 extends Thread{
	 int sum=0;
	
	 @Override
	 public void run() {
		
		for(int i=1;i<=100;i++) {
			sum=sum+i;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 }
}



public class Example18 {

	public static void main(String[] args) throws InterruptedException { 
		MyThread18 t1=new MyThread18();
		t1.start();
		//Thread.sleep(10000);
		t1.join(5000);
	    System.out.println(t1.sum); 
	}
}	
	