package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//Collection->Interface
		//Collections->Class
		
		//Integer,Character,String->Object
		//Array->primitive,String
		//Collection->Objects
		
		//ArrayList->Read Operations,Order of insertion,null accept,duplicates
		//LinkedList->Write Operations,Order of insertion,null accept,duplicates
		
		//List->Interface
		List<String> al=new LinkedList<String>();
		al.add("Mike");
		al.add("Maru");
		al.add("Maru");
		al.add(null);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("*************************");
		
		for(String ele:al) {
			System.out.println(ele);
		}
		
		System.out.println("*************************");
		
		Iterator<String> iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("*************************");
		
		ListIterator<String> listIterator = al.listIterator();
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		
	}

}
