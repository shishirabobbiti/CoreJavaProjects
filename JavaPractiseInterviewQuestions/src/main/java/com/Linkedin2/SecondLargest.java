package com.Linkedin2;

public class SecondLargest {

	public static void main(String[] args) {
		int[] num = { 4, 3, 7, 3, 1, 6, 2 };
		int max=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			//System.out.println(max+"max number");
		}
		int secmax=0;
		for(int j=0;j<num.length;j++) {
			if(num[j]!=max) {
				if(num[j]>secmax) {
					secmax=num[j];			
				}
				
							}
			
		}
		System.out.println(secmax+ "Secmax");
		
	}
		
	}



