package com.Linkedin;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter String");
				String s=sc.next();
				String rev="";
				for(int i=s.length()-1;i>=0;i--) {
					rev+=s.charAt(i);
				}
				System.out.println(rev);
	
	if(s.equals(rev)) {
		System.out.println("String is palindrome string");
	}
	else {
		System.out.println("String is not palindrome string");
	}
}

}
