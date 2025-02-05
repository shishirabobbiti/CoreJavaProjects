package com.practise;
public class Program3{
	public static void main(String[] args){
		int i=3;
		long l=7895L;
		float f=23.56f;
		double d=34.567;
		l=i;
		System.out.println(l);
		i=(int)l;
		System.out.println(i);
		d=f;
		System.out.println(d);
		f=(float)d;
		System.out.println(f);
		l=(long)d;
		System.out.println(l);
		
	}
}