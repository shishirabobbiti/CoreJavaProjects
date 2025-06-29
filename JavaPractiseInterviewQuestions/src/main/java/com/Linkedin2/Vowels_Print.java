package com.Linkedin2;

public class Vowels_Print {

	public static void main(String[] args) {
			String s="java123 8 9 ";
			int vowels=0;
			int consonants=0;
			int digits=0;
			int spaces=0;
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if((ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
					System.out.println(ch+" i am a vowel");
					vowels++;
				}
				else if(ch>='a' && ch<='z') {
					System.out.println(ch+" I am a consonant");
					consonants++;
				}
				else if(ch>='1' && ch<='9') {
					System.out.println(ch+" I am a digit");
					digits++;
				}
				else if(ch==' ') {
					spaces++;
				}
				
			}
			System.out.println("vowesls: "+vowels +" " +"Consonants: "+consonants+" "+"digits: "+digits+" "+"spaces: "+spaces);
	}

}
