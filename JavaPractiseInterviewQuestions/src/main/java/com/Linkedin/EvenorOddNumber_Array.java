package com.Linkedin;

public class EvenorOddNumber_Array {

	public static void main(String[] args) {
		int[] a= {2,3,6,8,9,10,23,45,56,76,79};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i] + " is Even Number " );
			}
			else {
				System.out.println(a[i] +" is Odd Number");
			}
		}
	}

}
