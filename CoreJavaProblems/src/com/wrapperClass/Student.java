package com.wrapperClass;
public class Student{
	
	public static void main(String[] args){
	
	//Wrapper Object:Auto Boxing
	Integer i= 20;
	System.out.println(i);

	//Integer to String
	String s=i.toString();
	System.out.println(s+1);

	//String to Integer
	Integer j=Integer.parseInt(s);
	System.out.println(j+1);

	//Integer to Long
	Long l=Long.valueOf(j);
	System.out.println(l);
	
	Integer wrappedInt=30;

        // Auto unboxing: converting wrapper object to primitive
        int unwrappedInt = wrappedInt.intValue();
        System.out.println("Unwrapped Integer: " + unwrappedInt);

	}
	
//parseInt();
//valueOf();
//xxxValue();
}