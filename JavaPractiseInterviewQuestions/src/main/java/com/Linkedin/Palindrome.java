package com.Linkedin;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int temp=num;
		String s = "";
		int res=0;
		while (num != 0) {
			int rev = num % 10;
			s = s + rev;
			num = num / 10;

		}
		//int r = Integer.parseInt(s);
		Integer r=Integer.valueOf(s);
		
		if (temp == r) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
	}

}
