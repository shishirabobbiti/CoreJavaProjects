package com.hackerRank;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A string");
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++){
                 if(Character.isWhitespace(i) && !Character.isLetterOrDigit(i)) {
                	 System.out.println(s.charAt(i));
                	 count++;
                	   
                   }
               }
        System.out.println(count);  

          }
}