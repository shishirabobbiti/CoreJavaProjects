package com.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsClassExample {

	public static void main(String[] args) {
		
		List<Integer> ll=new LinkedList<Integer>();
		ll.add(1);
		ll.add(6);
		ll.add(2);
		ll.add(9);
		ll.add(3);
		ll.add(7);
		
		Iterator<Integer> it=ll.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("***********************");
		
		Collections.sort(ll);
		Iterator<Integer> it1=ll.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
		
		System.out.println();
		System.out.println("***********************");
		
		Collections.sort(ll,Collections.reverseOrder());
		Iterator<Integer> it2=ll.iterator();
		while(it2.hasNext()) {
			System.out.print(it2.next()+" ");
		}
		
		System.out.println();
		System.out.println("***********************");
		
		int max=Collections.max(ll);
		int min=Collections.min(ll);
		System.out.println(max+" "+min);
		
		Collections.shuffle(ll);
		Collections.unmodifiableCollection(ll);
		Collections.synchronizedCollection(ll);
		Collections.binarySearch(ll, 5);
		Collections.reverse(ll);
	}

}
