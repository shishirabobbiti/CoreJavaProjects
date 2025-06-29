package com.Linkedin;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
			List al=new ArrayList();
			al.add("welcome");
			al.add(100);
			al.add(10.5);
			al.add('C');
			al.add(true);
			System.out.println(al.size());
			System.out.println(al.get(2));
			System.out.println("Before Inserting "+ al );
			al.add(1,"selenium");
			System.out.println("After Inserting "+ al );
			System.out.println(al.remove(3));
			System.out.println("After remove "+ al );
			for(Object i:al) {
			  System.out.println(i);
			}
	}

}
