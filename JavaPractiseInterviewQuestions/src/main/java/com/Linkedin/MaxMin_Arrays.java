package com.Linkedin;

public class MaxMin_Arrays {

	public static void main(String[] args) {
		int[] arr= {10,20,200,101,30,70};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
			
		}
		System.out.println("Max number is :" + max);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
			
		}
		System.out.println("Min number is : " + min);
	}

}
