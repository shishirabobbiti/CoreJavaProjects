package com.Linkedin;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();	
		list.add("John");
		list.add("David");
		list.add("Scott");
		list.add("Smith");
		System.out.println(list.size());
		for(String s:list) {
			System.out.println(s);
			
		}

	}

}
