package com.practice;

import java.io.*;
import java.util.*;

public class ReverseNum {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=0){
        	if(num==0) {
        		System.out.println(num);
        	}
            while(num>0) {          
            	int n=num%10;
                System.out.print(n);
                num=num/10;
            }       
            
        }
    }
}