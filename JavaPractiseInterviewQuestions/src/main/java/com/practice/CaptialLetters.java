package com.practice;

public class CaptialLetters {

	public static void main(String[] args) {

		String inputString = "SishiraReddY";
		StringBuilder s = new StringBuilder();
//		for (int i = 0; i < inputString.length(); i++) {
//        	char c = inputString.charAt(i);
//			if (Character.isUpperCase(c)) {
//				s.append(c);
//			}
//			if(c>='A'&& c<='Z') {
//				System.out.print(c);	
//			}
//		}
		char[] carr = inputString.toCharArray();
		for (char c : carr) {
			if (c >= 'A' && c <= 'Z') {
				System.out.print(c);
			}
		}
		System.out.println(s);
	}

}
