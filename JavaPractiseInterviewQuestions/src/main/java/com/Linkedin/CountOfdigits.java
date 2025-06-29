package com.Linkedin;

public class CountOfdigits{

	public static void main(String[] args) {
		int num=34567;
		int count=0;
		while(num!=0) {
			int n=num%10;
			count++;
			num=num/10;
		}
		
System.out.println(count);
	}
}
