package com.Linkedin2;

public class sum_digits_of_a_number {

	public static void main(String[] args) {
		int num=251025, sum=0,temp=num;
		
		while(num>0) {
			int n=num%10;
			sum=sum+n;
			num=num/10;
		}
		System.out.println("Sum of digits of a number: "+sum);
	}

}
