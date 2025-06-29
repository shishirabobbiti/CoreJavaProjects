package com.Linkedin2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int num=sc.nextInt();
		int temp=num;
		String s="";
		while(num>0) {
			int n=num%10;
			s=s+n;
			num=num/10;
		}
	int m=Integer.parseInt(s);
		if(temp==m) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");

		}
		
	}

}
