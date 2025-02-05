package com.practise;
public class Calculator{
	public static void main(String[] args){
		Calculator cal1=new Calculator();
		cal1.add(30,40);
		//cal1.add(80,90,100);
		cal1.add(80,90,100,110);
		cal1.add(12.1f,20);
		cal1.add(30,40.6f);
		
	}
	public void add(int i,int j){
		int sum=0;
		sum=i+j;
		System.out.println(sum);
	}
	
	public void add(int i,int j,int x,int y){
		int sum=0;
		sum=i+j+x+y;
		System.out.println(sum);
	}
	public void add(float i,int j){
		float sum=0;
		sum=i+j;
		System.out.println(sum);
	}
	public void add(int i,float j){
		float sum=0;
		sum=i+j;
		System.out.println(sum);
	}
}