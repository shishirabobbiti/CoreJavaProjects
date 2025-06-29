package com.Linkedin2;

public class Palindrome1ton {

	public static void main(String[] args) {
		int n=1000,sum=0;
		String s="";
		for(int i=1;i<=n;i++) {
			int num=i;
			while(num>0) {
				int r=num%10;
				s=s+r;
				num=num/10;
			}
			int m=Integer.parseInt(s);
			s="";
			if(i==m) {
				System.out.println(i);
			}
		}

	}

}
