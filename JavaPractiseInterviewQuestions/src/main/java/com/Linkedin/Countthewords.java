package com.Linkedin;

import java.util.Scanner;

public class Countthewords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String s1=s.trim();
		int count =1;
		for(int i=0;i<s1.length()-1;i++) {
			if((s1.charAt(i)==' ') && (s1.charAt(i+1)!=' ')) {
				count++;
			}
			
		}
		System.out.println("Number of words is present in string "+ count);
	}

	
	
}	