package com.practice;

import java.util.Scanner;

public class NumberofDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		for(int i=0;i<n;i++) {
			int num=n%10;
			count++;
			n=n/10;
		}
		System.out.println("number of DIgits "+count);
	}

}
