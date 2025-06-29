package com.multithreading;

class Display1{
	public  void wish() {
		synchronized(Display1.class) {
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
}

class MyThread19 extends Thread{
	Display1 d=null;
	public MyThread19(Display1 d) {
		this.d=d;
	}
	
	 @Override
	 public void run() {	 
		 d.wish();
		 
	 }
}



public class Example19 {

	public static void main(String[] args) throws InterruptedException {
	   Display1 d1=new Display1();
	   Display1 d2=new Display1();
	   Display1 d3=new Display1();
		MyThread19 t1=new MyThread19(d1);
		MyThread19 t2=new MyThread19(d2);
		MyThread19 t3=new MyThread19(d3);
	   
//	   MyThread19 t1=new MyThread19(d1);
//		MyThread19 t2=new MyThread19(d1);
//		MyThread19 t3=new MyThread19(d1);
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
	}
}	
	