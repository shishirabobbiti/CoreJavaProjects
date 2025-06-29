package com.Linkedin;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a string");
     String s=sc.nextLine();
     String[] words=s.split(" ");
     String reverseString=" ";
    
     for(int i=0;i<words.length;i++) {
    	 String s1=words[i];
    	 String rev=" ";
    	 for(int j=s1.length()-1;j>=0;j--) {
    		 rev=rev+s1.charAt(j);
    	 }
    	 reverseString=reverseString+rev+" ";
     }
     System.out.println(reverseString);
	}

}
