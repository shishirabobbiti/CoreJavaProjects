package com.Linkedin;

import java.util.Scanner;

public class TwoDArrayAdd2 {

	public static void main(String[] args) {
	
		int [][]a= {{1,2},{3,4}};
		int[][]b= {{3,4},{5,6}};
		int sum[][]=new int[2][2];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
					
			
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++) {
				System.out.print(sum[i][j] +" ");
			}
			System.out.println(" ");
		
	    }
    }
}