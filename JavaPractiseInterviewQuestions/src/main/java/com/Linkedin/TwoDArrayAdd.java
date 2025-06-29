package com.Linkedin;

import java.util.Scanner;

public class TwoDArrayAdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter row size");
		int row1Size=sc.nextInt();
		System.out.println("Enter col size");
		int col1Size=sc.nextInt();
		int [][]a=new int[row1Size][col1Size];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter "+i +" "+j);
				a[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("Enter row size");
		int row2Size=sc.nextInt();
		System.out.println("Enter col size");
		int col2Size=sc.nextInt();
		int [][]b=new int[row2Size][col2Size];
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println("Enter "+i +" "+j);
				b[i][j]=sc.nextInt();
				
			}
			
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				int sum=0;
				sum=a[i][j]+b[i][j];
				System.out.print(sum + " ");
			}
			System.out.print(" ");
		}
		
	}
}