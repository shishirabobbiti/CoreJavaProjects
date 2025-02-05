package com.practise;
import java.util.Scanner;
public class Code18{
	public static void main(String[] args){
	        Scanner sc= new Scanner(System.in);
		System.out.println("Enter Row Count::");
		int r=sc.nextInt();
		System.out.println("Enter Column Count::");
		int c=sc.nextInt();
		for(int i=1;i<=r;i++){
			for(int j=1;j<=i;j++){
				if(i%2!=0){
					if(j%2!=0)
						System.out.print("1");
					else
						System.out.print("0");
				}
				else{
					if(j%2!=0)
						System.out.print("0");
					else
						System.out.print("1");
				}
				
			}
			System.out.println();
		}
	}
}
//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1	

		

