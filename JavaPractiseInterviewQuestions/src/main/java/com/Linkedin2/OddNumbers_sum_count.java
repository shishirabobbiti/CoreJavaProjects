package com.Linkedin2;

public class OddNumbers_sum_count {

	public static void main(String[] args) {
		int sum=0, count=0;
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
				count++;
				sum=sum+i;
				System.out.println();
				}
		}
		System.out.println("sum: "+ sum);
		System.out.println("No of odd numbers from 1 to 100: "+count);

	}

}
