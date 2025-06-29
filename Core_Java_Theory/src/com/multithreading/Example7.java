package com.multithreading;

class MyThread7 extends Thread{
	 @Override
	 public void run() {
		 for(int i=0;i<=10;i++) {
			 System.out.println("Mythread Thread");
		 }
	 }
}
class MyRunnable implements Runnable{
	 @Override
	 public void run() {
		 for(int i=0;i<=10;i++) {
			 System.out.println("MyRunnable Thread");
		 }
	 }
}

public class Example7 {

	public static void main(String[] args) {
		
		MyRunnable r=new MyRunnable();
		MyThread7 mt7=new MyThread7();
		Thread t1=new Thread(r);
		Thread t2=new Thread(mt7);
		Thread t3=new Thread();
		t1.start();
		t2.start();
		t3.start();
		for(int i=0;i<=10;i++) {
			 System.out.println("Main Method");
		 }
	}

}
