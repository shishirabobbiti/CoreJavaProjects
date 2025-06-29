package com.multithreading;

class MyThread8 extends Thread{
	 @Override
	 public void run() {
		 for(int i=0;i<=10;i++) {
			 System.out.println("Mythread Thread");
		 }
	 }
}
class MyRunnable2 implements Runnable{
	 @Override
	 public void run() {
		 for(int i=0;i<=10;i++) {
			 System.out.println("MyRunnable Thread");
		 }
	 }
}

public class Example8 {

	public static void main(String[] args) {
		
		MyRunnable2 r=new MyRunnable2();
		MyThread8 mt8=new MyThread8();
		Thread t1=new Thread(r);
		Thread t2=new Thread(mt8);
		Thread t3=new Thread();
		t1.start();
		t2.start();
		t3.start();
		mt8.start();
		for(int i=0;i<=10;i++) {
			 System.out.println("Main Method");
		 }
	}

}
