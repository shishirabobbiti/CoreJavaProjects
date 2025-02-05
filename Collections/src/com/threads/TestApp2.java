package com.threads;

class MyThread2 extends Thread{
	 @Override
	 public void run(){
	     System.out.println("run() executed by Thread  :: "+Thread.currentThread().getName());
	 }
	 }
	 public class TestApp2{
	 public static void main(String... args){
	 MyThread2 t=new MyThread2();
	t.start();
	 System.out.println("main() executed by Thread ::"+Thread.currentThread().getName());
	 }
	 }
