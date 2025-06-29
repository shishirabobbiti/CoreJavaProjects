package com.hackerRank;

import java.util.Scanner;

public class FormattingOutput {
	/*
	 * To get you started, a portion of the solution is provided for you in the
	 * editor; you must format and print the input to complete the solution.
	 * 
	 * Input Format
	 * 
	 * Every line of input will contain a String followed by an integer. Each String
	 * will have a maximum of alphabetic characters, and each integer will be in the
	 * inclusive range from to .
	 * 
	 * Output Format
	 * 
	 * In each line of output there should be two columns: The first column contains
	 * the String and is left justified using exactly characters. The second column
	 * contains the integer, expressed in exactly digits; if the original input has
	 * less than three digits, you must pad your output's leading digits with
	 * zeroes.
	 * Explanation
	 * 
	 * Each String is left-justified with trailing whitespace through the first  characters.
	 * The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.
	 */
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++){
             String s1=sc.next();
             int x=sc.nextInt();
				/*
				 * %-15s → Left-align the string in a field of 15 characters. %03d → Print the
				 * integer as exactly 3 digits, adding leading zeros when necessary. %n →
				 * Ensures a new line after each entry.
				 */
            System.out.printf("%-15s%03d%n",s1,x);
         }
         System.out.println("================================");

	}

}
