package com.practise;
import java.util.Scanner;
public class Code10{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Row Count::");
		int r=sc.nextInt();
		System.out.println("Enter Column Count::");
		int c=sc.nextInt();
		for(int i=0;i<=r-1;i++){
			for(int j=0;j<=c-1;j++){
				if(i==j ||(i+j==r-1)){
					System.out.print("*");
				}
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}				

