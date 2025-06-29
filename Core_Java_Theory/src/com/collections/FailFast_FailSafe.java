package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFast_FailSafe {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();	
		al.add("Mike");
		al.add("Maru");
		al.add("Prabha");
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//			al.add("Heshika");
//		}
		Iterator<String>it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			al.add("Heshika");
		}	
	    ConcurrentHashMap<Integer ,String> ch=new ConcurrentHashMap<Integer, String>();
	    ch.put(1, "Mike");
	    ch.put(2, "Shishira");
	    Set entrySet = ch.entrySet();
		Iterator it3 = entrySet.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
			ch.put(3, "Heshika");
	}
	}
     
}
