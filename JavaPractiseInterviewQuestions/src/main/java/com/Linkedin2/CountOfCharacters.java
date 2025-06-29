package com.Linkedin2;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfCharacters {

	public static void main(String[] args) {
		String s="Programming";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			count++;
		}
		System.out.println("Number of characters: "+count);
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() +" -> "+entry.getValue());
		}
	}
	

}
