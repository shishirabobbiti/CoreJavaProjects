package com.Linkedin2;

public class Armstrong {

	public static void main(String[] args) {
		int num=153,sum=0,temp=num;
		//153,370,371,407 are armstrong numbers
 		while(num>0) {
			int n=num%10;
			sum=sum+(n*n*n);
			num=num/10;
			}
		if(temp==sum) {
			System.out.println(temp +" is Armstrong number");

		}
		else {
			System.out.println(temp +" is not Armstrong number");

		}
	}

}
