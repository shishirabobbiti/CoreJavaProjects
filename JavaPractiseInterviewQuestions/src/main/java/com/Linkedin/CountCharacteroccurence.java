package com.Linkedin;

import java.util.Scanner;

public class CountCharacteroccurence {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String s=sc.nextLine();
      char c='a';
      int count=0;
      for(int i=0;i<s.length();i++) {
    	  if(s.charAt(i)==c) {
    		  count++;
    	  }
      }
      System.out.println("Number of occurence of 'a' is : "+ count);
	}

}
