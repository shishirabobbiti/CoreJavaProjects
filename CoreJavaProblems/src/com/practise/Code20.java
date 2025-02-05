package com.practise;
import java.util.Scanner;
public class Code20{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Row size::");
		int r=sc.nextInt();
		System.out.println("Enter Column size::");
		int c=sc.nextInt();
		int[][] a= new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.println("Enter " +i+" Row "+j+" Column value" );
				int x=sc.nextInt();
				a[i][j]=x;
								
			}
			
		}
			for (int[] row : a){
            			for (int element : row) {
               				 System.out.print(element + " ");
            			}
           			 System.out.println(); // New line for the next row
        		}
  }
}