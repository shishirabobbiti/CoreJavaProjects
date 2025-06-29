package com.practice;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
		int rows = sc.nextInt();
		System.out.println("Enter Column size");
		int cols = sc.nextInt();
		int[][] a = new int[rows][cols];
		int[][] b= new int[cols][rows];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter " + i + " " + j);
				a[i][j] = sc.nextInt();
			}

		}
		  System.out.println("Before transpose matrix");
      for(int i=0;i<a.length;i++) {
    	  for(int j=0;j<a[i].length;j++) {
    		
    		  System.out.print(a[i][j]);
    		  b[j][i]=a[i][j];
    	  }
    	  System.out.println();
      }
      System.out.println("After transpose matrix");
   for(int i=0;i<b.length;i++) {
	   for(int j=0;j<b[i].length;j++) {
		  
		   System.out.print(b[i][j]+ " ");
	   }
    	  System.out.println();
      }
      
	}

}

