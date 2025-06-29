package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateChar {

	public static void main(String[] args) {
		String s="shishirasisssssssssssssssr";
		String res="";
		for(int i=0;i<s.length();i++) {
			char a=s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				char b=s.charAt(j);
				if(a==b) {
					if(res.contains(Character.toString(a))) {
						break;
					}
					else {
					System.out.print(a);
					res+=a;
					break;
					}
				}	
			}
		}
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char a=s.charAt(i);
			map.put(a,map.getOrDefault(a,0)+1);
		}
		for(Map.Entry<Character, Integer> m: map.entrySet()) {
			if(m.getValue()>1) {
				System.out.print(m.getKey());
			}
		}
		
	}

}
