package com.wrapperClass;

public class Stud {

	public static void main(String[] args) {
		//wrapper object to String
			Integer i=2;
			String s=i.toString();
			System.out.println("wrapper object to String: "+s);
			//primitive to string
			int j=3;
			String s1=Integer.toString(j);
			System.out.println("primitive to string: "+s1);
			//string to wrapper object
			String s3="83";
			Integer k=Integer.valueOf(s3);
			System.out.println("Wrapper object to primitive: "+k);
			//primitive to wrapper objects
			int l=5;
			Integer a=Integer.valueOf(l);
			System.out.println("primitive to wrapper objects: "+a);
			//String to primitive
			String s2="34";
			int d=Integer.parseInt(s2);
			System.out.println("String to primitive: "+d);
			//Wrapper object to primitive
			Integer f=56;
			int n=f.intValue();
			System.out.println("Wrapper object to primitive: "+n);

	}

}
