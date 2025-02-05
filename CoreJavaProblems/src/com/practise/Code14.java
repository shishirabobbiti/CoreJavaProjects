package com.practise;
import java.util.Scanner;
public class Code14{
	public static void main(String[] args){
	        Scanner sc= new Scanner(System.in);
		System.out.println("Enter Row Count::");
		int r=sc.nextInt();
		System.out.println("Enter Column Count::");
		int c=sc.nextInt();
		for(int i=0;i<=r-1;i++){
			for(int j=0;j<=c-1;j++){
				if((i==0)||(i==r/2)||((j==c-1)&&(i<=r/2))||(j==0)){
					System.out.print("*");
				}
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}

//1
//12
//123
//1234
//12345				

		

