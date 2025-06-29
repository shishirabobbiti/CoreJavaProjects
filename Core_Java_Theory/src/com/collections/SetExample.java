package com.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		Map map=new HashMap<Integer,String>();
		
		set.add(1);
		map.put(1, "DUMMY");
		
		set.add(5);
		map.put(5, "DUMMY");
		
		set.add(13);
		set.add(2);
		set.add(17);
		set.add(9);
		//set.add(9);
		//set.add(null);
		//set.add(null);
		
		for(Integer i:set) {
			System.out.println(i);
		}
	
		
	}

}
