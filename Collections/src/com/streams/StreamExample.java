package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	static List<Integer> al;

	public static void main(String[] args) {
		al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(89);
		al.add(33);
		al.add(54);
		al.add(34);
		al.add(80);
		al.add(100);
//		for (int i = 0; i < al.size(); i++) {
//			if (al.get(i) % 2 == 0) {
//				System.out.println(al.get(i) + " Even Number");
//			} else
//				System.out.println(al.get(i) + " odd Number");
//
//		}
	 List<Integer> s= al.stream().filter(i->i%2==0).collect(Collectors.toList());
	 for(Integer i:s) {
		 System.out.println(i+ " is even");
	 }
	   
	 al.stream().map(j->j+1).collect(Collectors.toList()).forEach(System.out::println);
	   List<String> sl=new ArrayList<String>();
	   sl.add("Mike");
	   sl.add("Maruthi");
	   sl.add("Shishira");
	   sl.add("Jack");
	   sl.add("John");
	   sl.add("Annie");
	   sl.stream().map(k->k.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
	   sl.stream().filter(x->x.length()>5).collect(Collectors.toList()).forEach(System.out::println);
	  long p= sl.stream().filter(y->y.length()<=5).count();
	  System.out.println(p);
	Integer n= al.stream().min((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(n);
	Integer m= al.stream().min((i1,i2)->i2.compareTo(i1)).get();
	System.out.println(m);
	Integer max= al.stream().max((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(max);
	Integer min= al.stream().max((i1,i2)->i2.compareTo(i1)).get();
	System.out.println(min);
	Integer[] ar=al.stream().filter(i->i%2==0).toArray(Integer[]::new);
	for(Integer ms:ar)
	{
		System.out.println(ms + " is even number");
	}
	}

}
