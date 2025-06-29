package com.Linkedin2;

import java.util.LinkedHashMap;
import java.util.Map;

public class LargestWord {

	public static void main(String[] args) {
  String s=" java is a program";
  String[] word=s.split(" ");
  String largestWord="";
  for(int i=0;i<word.length;i++) {
	  if(word[i].length()>largestWord.length()) {
		  largestWord=word[i];
		  
	  }
	 
	  }
  String secondLargestWord="";
  for(int j=0;j<word.length;j++) {
	  if(word[j].length()!=largestWord.length()) {
		  if(word[j].length()>secondLargestWord.length()) {
			  secondLargestWord=word[j];
		  }
	  }
   		
   	}
  System.out.println("1st largest word: "+largestWord);
  System.out.println("2nd Largest : "+secondLargestWord);
  
  	}

}
