package com.Linkedin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromarrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("java");
		al.add("j2ee");
		al.add("jsp");
		al.add("servlets");
		al.add("java");
		al.add("struts");
		al.add("jsp");
		System.out.println("Array list with DUplicate values: " +al);
		LinkedHashSet set =new LinkedHashSet(al);
		ArrayList al1=new ArrayList(set);
		
		System.out.println("Array list without Duplicate values: "+set);
	}

}
