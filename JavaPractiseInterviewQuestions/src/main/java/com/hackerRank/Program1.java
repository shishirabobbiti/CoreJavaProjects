package com.hackerRank;

import java.util.Scanner;

public class Program1 {
	/* Question
	 * In this challenge, you must read integers from stdin and then print them to
	 * stdout. Each integer must be printed on a new line. To make the problem a
	 * little easier, a portion of the code is provided for you in the editor below.
	 * Input Format
	 * There are  lines of input, and each line contains a single integer.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String myString=scan.next();
        int b = scan.nextInt();
        scan.close();
        System.out.println(a);
        System.out.println(myString);
        System.out.println(b);
	}

}
