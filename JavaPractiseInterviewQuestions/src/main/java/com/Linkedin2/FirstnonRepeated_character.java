package com.Linkedin2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstnonRepeated_character {

	public static void main(String[] args) {
    String s="programming";
    Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();	
    for(int i=0;i<s.length();i++) {
    	char ch=s.charAt(i);
    	 // If character exists, increase count; otherwise, set it to 1
    	map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    // Step 2: Loop again to find the first character that occurred only once

    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
    	if(entry.getValue()==1) {
    		System.out.println("First non-repeated character: " + entry.getKey());
    		return;// Stop once we find the first one
    	}
   
   
	}

}
}
