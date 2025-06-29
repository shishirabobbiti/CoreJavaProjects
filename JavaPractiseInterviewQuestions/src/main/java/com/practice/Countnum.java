package com.practice;

import java.util.Scanner;

public class Countnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		//int n=sc.nextInt();
		int count = 0;
		while(num>0) {
			int d=num%10;
//			if(d==n) {
//				count++;
//			}
			count++;
			num=num/10;
		
		  }
		System.out.println(count);
		
	}
	

}
