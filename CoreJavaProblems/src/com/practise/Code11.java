package com.practise;
public class Code11{
	
	static int a;
	int b;
	int c;
	static{
		System.out.println("Static Block");
		a=10;
	}
	{
		System.out.println("Instance Block");
		b=20;
	}

	public Code11(){
		//super()
		//instance block
		System.out.println("Code11 Constructor");
	}

	public Code11(int c){
		System.out.println("Code11 Para Constructor");
		this.c=c;
	}

	public static void main(String[] args){
	
		Code11 c= new Code11();
		System.out.println(a);
		System.out.println(c.b);
		c.c=30;
		System.out.println(c.c);
		Code11 c1=new Code11(40);
		System.out.println(c1.c);
		c.addition();
		statMethod();
		int d=getStaticValue();
		System.out.println(d+c.b);
		int x=2;
		//c.addition(x,y);

	}

	public void addition(){
		System.out.println(a+b);
	}

	public void addition(int a,int b){
		System.out.println(a+b);
	}

	public static void statMethod(){
		System.out.println(a+5);
	}

	public static int getStaticValue(){
		return a;
	}

}