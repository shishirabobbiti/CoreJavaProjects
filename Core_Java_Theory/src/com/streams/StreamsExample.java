 package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {
		
		//Collection->Group of objects
		//Streams->processing objects from the collection
		
		//java.util.Streams->Collections Objects deal
		//java.io.Streams->Files
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mike");
		al.add("BobbiliPuli");
		al.add("Shishira");
		al.add("Prabhakar");
		al.add("Baby");
		
		//Read
//		List<String> collect = al.stream().filter(s->s.length()>8).collect(Collectors.toList());
//		
//		collect.forEach(System.out::println);
//		
//		collect.forEach(s->{
//			System.out.println(s);
//		});
		System.out.println("******************************");
		al.stream().filter(s->s.length()>8).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("******************************");
		al.stream().filter(s->s.startsWith("B")).collect(Collectors.toList()).forEach(System.out::println);
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(9);
		li.add(13);
		li.add(15);
		System.out.println("******************************");
		li.stream().filter(i->!(i%2==0)).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("******************************");
		//write
		al.stream().map(i->i.concat("Mike")).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("******************************");
		li.stream().map(i->i*2).collect(Collectors.toList()).forEach(System.out::println);
		
		//count()
		long count= al.stream().filter(s->s.length()>8).count();
		System.out.println("******************************");
		System.out.println(count);
		
		System.out.println("******************************");
		//sort()
		al.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		//sum->reduce()
		int sum=li.stream().reduce(0,(a,b)->a+b);
			
		System.out.println("******************************");
		System.out.println(sum);
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Baby");
		hs.add("Bobbiti");
		hs.add("Bobbili");
		hs.add("Mukku");
		
		//allMatch()
		boolean b=hs.stream().allMatch(i->i.startsWith("B"));
		System.out.println("******************************");
		System.out.println(b);
		
		System.out.println("******************************");
		
		//findAny()
		Optional<String> any = hs.stream().filter(s->s.length()>=3).findAny();
		any.ifPresent(s->System.out.println(s));
		//Optional class->To handle null pointer exception
		
		System.out.println("******************************");
		Optional<String> anyf = hs.stream().filter(s->s.length()>5).findFirst();
		anyf.ifPresent(s->System.out.println(s));
		
		//max()
		//min()
		//Array conversion
		
		Optional<Integer> minNumber =li.stream().min((i, j) -> i.compareTo(j));
		System.out.println(minNumber.get());
		
		Optional<Integer>maxNumber=li.stream().max((i,j)->i.compareTo(j));
		System.out.println(maxNumber.get());
		
		Stream<String> stream = Stream.of("Apple", "Banana", "Cherry");
        String[] array = stream.toArray(String[]::new);
        System.out.println(Arrays.toString(array));
	}

}
