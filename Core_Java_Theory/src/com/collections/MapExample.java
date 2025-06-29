package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"Mike");//entry->K,V
		map.put(2, "Maruthi");
		map.put(3, "Bobbiti");
		map.put(3, "Shishira");//collision->value gets updated
	//map.put(null,"Maddela");
//		map.put(null,"Accenture");
	//map.put(4,null);
	//	map.put(5,null);
		map.put(5,"Infosys");
		
		System.out.println("Print Values::");
		Collection values = map.values();
		Iterator it1 = values.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("************************");
		
		System.out.println("Print Keys::");
		Collection keys = map.keySet();
		Iterator it2 = keys.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("Print EntrySet::");
		System.out.println("************************");
		Set entrySet = map.entrySet();
		Iterator it3 = entrySet.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		System.out.println("Print Entry.Map::");
		System.out.println("************************");
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			if(entry.getKey()==5) {
				System.out.println(entry.getValue());
			}
		}
	}

}
