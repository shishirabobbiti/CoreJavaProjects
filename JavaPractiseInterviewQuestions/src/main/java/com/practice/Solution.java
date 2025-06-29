package com.practice;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=1,s=1;
        int sum=0;
        for(int i=0;i<=n;i++){
            int next=f+s;
            f=s;
            s=next;
           sum=sum+s;
        }
        System.out.println(s);
    }
}
