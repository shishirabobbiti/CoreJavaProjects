package com.practice;

import java.io.*;
import java.util.*;

public class DuckNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.startsWith("0")) {
			System.out.println("it is not a Duck number having 0 at the starting");
		}
		else {
			int n = Integer.parseInt(s);
			int count = 0;
			if (n >= 0) {
				while (n > 0) {
					int temp = n % 10;
					if (temp == 0) {
						count++;
					}
					n = n / 10;
				}

			}
			if (count > 0) {
				System.out.println("Yes it is Duck number");
			} else {
				System.out.println("No");
			}

		}
		
	}

}
