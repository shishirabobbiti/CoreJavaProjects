package com.Linkedin;

import java.util.Scanner;

public class SearchNumberInArray {
	
	public static void main(String[] args) {
		int a[]= {10,20,50,70,100};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		boolean flag=false;
		
		for(int i:a) {
			if(num==i) {
				System.out.println("Number found :"+i);
				flag=true;
				break;
			}
			
		}
		if(flag==false) {
			System.out.println("Number not found");
		}
	}

}
