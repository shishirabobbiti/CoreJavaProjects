package com.hackerRank;

import java.util.Scanner;

public class IF_ELSE {

	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
		  int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	         if(N%2!=0){
	            System.out.println("odd Weird");
	         }
	         else if((N%2==0) && (N<=5)){
	        	 System.out.println("Not Weired");
	        	 
	         }
	         else if((N%2==0) && (N>=6 && N<=20)){
	        	 System.out.println("Weired");
	        	 
	         }
	         else if((N%2==0) && (N>20)){
	        	 System.out.println("Not Weired");
	        	 
	         }
	        
	         
	}

}
