package com.practise;
import java.util.Scanner;
public class Code16{
	public static void main(String[] args){
	        Scanner sc= new Scanner(System.in);
		System.out.println("Enter Row Count::");
		int r=sc.nextInt();
		System.out.println("Enter Column Count::");
		int c=sc.nextInt();
		for(int i=1;i<=r;i++){
			for(int j=1;j<=c;j++){
				System.out.print("*");
			}	
			System.out.println();
			c--;
		}
	}
}
//12345->i=0,j=0
//1234->i=1,j=4	
//123->i=2,j=3
//12
//1		

		

