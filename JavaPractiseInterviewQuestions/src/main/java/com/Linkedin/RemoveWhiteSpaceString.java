package com.Linkedin;

public class RemoveWhiteSpaceString {

	public static void main(String[] args) {
		String str=" Core java selenium automation oops  programming  ";
		String strwithoutSpace=str.replaceAll(" ", "");
		System.out.println(strwithoutSpace);
	}

}
