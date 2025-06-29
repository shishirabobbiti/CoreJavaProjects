package com.practice;

import java.util.Scanner;

public class TwodAdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size");
		int rows=sc.nextInt();
		System.out.println("Enter column size");
		int cols=sc.nextInt();
		int [][] a=new int[rows][cols];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter "+ i+" " + j);
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter row size");
		int row2=sc.nextInt();
		System.out.println("Enter column size");
		int col2=sc.nextInt();
		int [][] b=new int[rows][cols];
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println("Enter "+ i+" " + j);
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				int sum=0;
				sum=a[i][j]+b[i][j];
				System.out.print(sum + " ");
			}
			System.out.println();
		}

	}

}
