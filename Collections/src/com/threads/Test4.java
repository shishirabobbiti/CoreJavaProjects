package com.threads;

class MyThread6 extends Thread{
	 static Thread mt;
	 @Override
	 public void run(){
	 try{
	 mt.join();
	 }
	 catch (InterruptedException e){
	 }
	for (int i=1;i<=10 ;i++ ){
	 System.out.println("child thread");
	 }
	 }
	 }
	 public class Test4 {
	 public static void main(String... args)throws InterruptedException{
	 MyThread6.mt=Thread.currentThread();
	 MyThread6 t=new MyThread6();
	 t.start();
	 for (int i=1;i<=10;i++ ){
	 System.out.println("main thread");
	 Thread.sleep(2000);//20sec sleep
	 }
	 }
	 }
