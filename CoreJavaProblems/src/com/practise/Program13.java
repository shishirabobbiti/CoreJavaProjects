package com.practise;
class Program13{
	int i;
	static int x=2;
	public static void main(String[] args){
		final int j=20;
		Program13 var=new Program13();
		System.out.println(var.i);
		System.out.println(x);
		var.m();
		System.out.println(j);
		//j=30;
		//System.out.println(j);

	}
	public void m(){
		System.out.println(i);
		System.out.println(x);
	}
}