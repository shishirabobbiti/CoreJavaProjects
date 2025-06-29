package com.hackerRank;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="shishira";
		for(int i=0;i<str.length();i++) {
			if(i==0) {
				String s=Character.toString(str.charAt(i));
				System.out.print(s.toUpperCase());
			}
			else {
				System.out.print(str.charAt(i));
			}
			
		}

		String a=str.substring(0,1).toUpperCase();
		String b=str.substring(1);
		System.out.println(a+b);
	}

}
