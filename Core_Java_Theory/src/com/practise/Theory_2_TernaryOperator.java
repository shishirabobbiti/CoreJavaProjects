package com.practise;

public class Theory_2_TernaryOperator {

	public static void main(String[] args) {
		
		int a =10;
		int b=20;
		
		if(a<b)
			System.out.println(a);
		else
			System.out.println(b);
		
		// returnValue=(condition)?true:false;
		int c=(a<b)?a:b;
		System.out.println(c);

	}

}
