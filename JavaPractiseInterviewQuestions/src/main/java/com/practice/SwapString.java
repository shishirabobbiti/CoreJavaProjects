package com.practice;

public class SwapString {

	public static void main(String[] args) {
		String s="Shishira";
		String r="Bobbiti";
		//String s=s+r;
		s=s+r;
//		r=k.substring(0,8);
//		s=k.substring(8);
		r=s.substring(0,s.length()-r.length());
		s=s.substring(r.length());
		System.out.println("S: "+s);
		System.out.println("R: "+r);

	}

}
