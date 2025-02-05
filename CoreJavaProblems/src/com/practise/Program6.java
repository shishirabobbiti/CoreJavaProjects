package com.practise;
public class Program6{
	public static void main(String[] args){
		int i=5,j=2;

		i=i+2;
		i+=2;
		if(i>=5)
			System.out.println("one");
		else
			System.out.println("two");
		int add=j==2?i+j:i-j;
		System.out.println(add);
	}
}