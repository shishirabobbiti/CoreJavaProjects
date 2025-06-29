package com.practice;

import java.util.Scanner;

public class EndsWith {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		String s = "";
		int j=0;
		// bvnmmhuiii
		// mmhuiii
		for (int i = str1.length() - str2.length(); i < str1.length(); i++) {
			char c1=str1.charAt(i);
			char c2=str2.charAt(j);
			if(c1==c2) {
				s+=c1;
			}
			j++;
		}
		//System.out.println(s);
		if(s.equals(str2)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
