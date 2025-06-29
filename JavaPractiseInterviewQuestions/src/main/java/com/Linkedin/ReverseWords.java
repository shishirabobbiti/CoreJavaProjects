package com.Linkedin;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a string");
     String s=sc.nextLine();
     String rev="";
     //String s1=s.trim();
     //String[] str=s.split(" ");
    for(int i=s.length()-1;i>=0;i--) {
    	rev=rev+s.charAt(i);
    	
     }
    System.out.println("Reverse String:"+rev);
	}

}
