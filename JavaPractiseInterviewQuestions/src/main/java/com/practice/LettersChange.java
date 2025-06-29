package com.practice;

import java.io.*;
import java.util.*;

public class LettersChange {

	public static void main(String[] args) {
		
		String s = "code";
		int[] arr = { 3, 0, 1, 2 };
		//ecod
		
		char c[]=new char[s.length()];
		String str1=new String(c);
        for(int j=0;j<s.length();j++){
            c[arr[j]]=s.charAt(j);
                
        }
        System.out.println(str1);
        System.out.println(s);
	}
}
