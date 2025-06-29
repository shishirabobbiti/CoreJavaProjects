package com.practise;
public class Program4{
	public static void main(String[] args){
		int i=4;
		System.out.println(i++);//post increment
		System.out.println(i);
		System.out.println(++i);//pre increment
		System.out.println(i);
		
		int j=5;
		int k=0;
		k=(j++)+(++j)+(++j);
		System.out.println(k);
		System.out.println(i--);//post decrement
		System.out.println(i);
		System.out.println(--i);//pre decrement
		System.out.println(i);
		
		j=5;
		k=0;
		k=(j--)+(--j)+(--j);
		System.out.println(k);


	}
}