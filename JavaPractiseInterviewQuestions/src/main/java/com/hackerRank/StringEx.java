/*Output Format

There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

Sample Input 0

hello
java*/
package com.hackerRank;
import java.io.*;
import java.util.*;

public class StringEx {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String a=A.substring(0,1).toUpperCase();
        String nameA= a + A.substring(1);
        String b=B.substring(0,1).toUpperCase();
        String nameB=b+B.substring(1);
        /* Enter your code here. Print output to STDOUT. */
        int sum=0;
        sum=A.length()+B.length();
        System.out.println(sum);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
            else{
                System.out.println("No");
            }
          System.out.println(nameA +" "+nameB);  
        }
       
    }

