package com.practise;
import java.util.Scanner;
public class Code17{
	public static void main(String[] args){
		int k=1;
	        Scanner sc= new Scanner(System.in);
		System.out.println("Enter Row Count::");
		int r=sc.nextInt();
		System.out.println("Enter Column Count::");
		int c=sc.nextInt();
		for(int i=1;i<=r;i++){
			for(int j=1;j<=i;j++){
				System.out.print(k);
			k++;
			}	
			System.out.println();
			
		}
}
}
//1
//2 3
//4 5 6
//7 8 9 10		

		

