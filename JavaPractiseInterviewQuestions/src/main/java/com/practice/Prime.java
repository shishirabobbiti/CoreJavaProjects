package com.practice;

import java.io.*;
import java.util.*;

public class Prime {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        if(num>0) {
        	while(num!=0){
        		int count=0;
        		int n=num%10;
        		for(int i=1;i<=n;i++) {
        			if(n%i==0) {
            			count++;
            		}	
        		}
        		if(count==2) {
        			sum=sum+n;
        		}
        		num=num/10;
        		
         	}
        	System.out.println(sum);
        }
    }  
}