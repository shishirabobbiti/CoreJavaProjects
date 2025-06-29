package com.hackerRank;

import java.util.Scanner;

public class While {
	/*
	 * Input Format
	 * 
	 * Read some unknown lines of input from stdin(System.in) until you reach EOF;
	 * each line of input contains a non-empty String.
	 * 
	 * Output Format
	 * 
	 * For each line, print the line number, followed by a single space, and then
	 * the line content received as input.
	 * 
	 * Sample Input
	 * 
	 * Hello world I am a file Read me until end-of-file.
	 */

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
	       
        int n=1;
       
        while(scan.hasNextLine()){
             String a=scan.nextLine();
            System.out.println(n+" "+a);
            n++;
        }
          
	}

}
