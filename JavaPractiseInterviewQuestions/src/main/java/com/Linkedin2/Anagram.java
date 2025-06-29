package com.Linkedin2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
			String firstw="own";
			String secondW="NOW";
			//Remove all white spaces from the two strings and convert them to uppercase.
			String firstWor=firstw.replaceAll(" ", "");
			String secondWor=secondW.replaceAll(" ","");
			System.out.println(firstWor);
			System.out.println(secondWor);
			System.out.println("***************************");

			//convert into same case
			String firstWord=firstWor.toLowerCase();
			String secondWord=secondWor.toLowerCase();
			System.out.println(firstWord);
			System.out.println(secondWord);
			System.out.println("***************************");
			//Use toCharArray() to turn the two strings into char arrays.
			char[] firstarr=firstWord.toCharArray();
			char[] secondarr=secondWord.toCharArray();
			System.out.println(firstarr);
			System.out.println(secondarr);
			System.out.println("***************************");
			//Sort the arrays
			Arrays.sort(firstarr);
			Arrays.sort(secondarr);
			System.out.println("***************************");

			System.out.println(firstarr);
			System.out.println(secondarr);
			System.out.println("***************************");
			//Compare
			if(Arrays.equals(firstarr,secondarr)) {
				System.out.println("words are anagrams");
			}
				else {
					
					System.out.println("words are not anagrams");

			}
	}

}
