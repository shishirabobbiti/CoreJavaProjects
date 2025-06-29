package com.Linkedin2;

public class ArmStrong_1to1000 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=1000;i++) {
			int num=i;
			while(num>0) {
				int n=num%10;
				sum=sum+(n*n*n);
				num=num/10;
			}
			if(sum==i) {
				System.out.println(i);
			}
			sum=0;
		}
	}

}
