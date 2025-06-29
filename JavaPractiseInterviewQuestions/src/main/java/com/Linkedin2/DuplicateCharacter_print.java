package com.Linkedin2;

import java.util.HashSet;

public class DuplicateCharacter_print {

	public static void main(String[] args) {
	    String s="Programming";
//		int []count=new int[256];
//		
//		for(int i=0;i<s.length();i++) {
//			char c=s.charAt(i);
//			count[c]++;
//		}
//		for(int j=0;j<256;j++) {
//			if(count[j]>1) {
//				System.out.println((char)j +" "+count[j]);
//			}
//		}
	   
		HashSet<Character> set=new HashSet<Character>();
		HashSet<Character> duplicates=new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(!set.add(c)) {
				System.out.println(c);
				duplicates.add(c);
				
			}
		}
		System.out.println(set);
		System.out.println(duplicates);
		
		
	}

}

