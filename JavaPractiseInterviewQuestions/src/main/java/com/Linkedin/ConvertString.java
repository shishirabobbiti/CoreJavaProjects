package com.Linkedin;

public class ConvertString {

	public static void main(String[] args) {
		int i=123;
		String s=Integer.toString(i);
		System.out.println("Integer.toString "+ s);
		s=String.valueOf(i);
		System.out.println("String.valueOf " + s);
	}

}
