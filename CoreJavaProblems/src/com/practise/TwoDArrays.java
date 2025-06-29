package com.practise;

import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter row size");
       int rows=sc.nextInt();
       System.out.println("Enter Column Size");
       int cols=sc.nextInt();
       int [][] a=new int[rows][cols];
       for(int i=0;i<a.length;i++) {
    	   for(int j=0;j<a[i].length;j++) {
    		   System.out.println("Enter"+ i +" "+j);
    		   a[i][j]=sc.nextInt();
    	   }
    	   
       }
       for(int i=0;i<a.length;i++) {
    	   for(int j=0;j<a[i].length;j++) {
    		   System.out.print(a[i][j] +" ");
    	   }
    	   System.out.println();
       }
	}

}
