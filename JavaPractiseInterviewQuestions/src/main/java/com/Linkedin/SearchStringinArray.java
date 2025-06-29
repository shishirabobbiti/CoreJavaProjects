package com.Linkedin;

import java.util.Scanner;

public class SearchStringinArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		String  a[]= {"abc","xyz","pqr","mno"};
		boolean flag=false;
		for(String i:a) {
			if(s.equals(i)) {
				System.out.println("String found :"+i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("String not found");
		}
	}

}
