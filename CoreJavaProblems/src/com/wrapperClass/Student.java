package com.wrapperClass;
public class Student{
	
	public static void main(String[] args){
	
	//Wrapper Object:Auto Boxing
	Integer i= 20;//primitive to Wrapper object
	System.out.println(i);

	//Integer to String
	String s=i.toString(); //wrapper object to string
	System.out.println(s+1);
	
	//Primitive to string
	int k=3;
	String s1=Integer.toString(k);
	System.out.println(s1);

	//String to Integer
	int j=Integer.parseInt(s);//string to primitive
	System.out.println(j+1);

	//Integer to Long
	Long l=Long.valueOf(j);//primitive to wrapper object
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