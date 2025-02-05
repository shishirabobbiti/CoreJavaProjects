package com.practise;
class Program14{
	static int a;
	int b;
	int c;
	static{
		a=10;
		System.out.println("Static Block");
		//System.out.println("b is::"+b);
	}

	{
		c=30;
		System.out.println("a in java block is::"+a);
		System.out.println("Non Static Block");
	}

	public Program14(){
		b=20;
		System.out.println("Constructor()");
	}
	
	public static void main(String[] args){
		display();
		Program14 p=new Program14();
		p.add();
	}

	public static void display(){
		System.out.println("Static Method");
		System.out.println("a is::"+a);
		//System.out.println("b is::"+b);
	}

	public void add(){
		if(false)
			System.out.println("This is false");
//		while(1<0){
//			System.out.println("This is false");//unreachable code
//		}
		System.out.println("Non Static Method");
		System.out.println(a+b+c);
	}
}