package com.interview;

public class Interview_5 {

	public static void main(String[] args) {
		//Byte,Short,Integer,Long,Float,Double,Boolean,Char
		   Integer i=10; //AutoBoxing using valueOf()
	       System.out.println(i);
	       Integer j=Integer.valueOf(20);//Autoboxing
	       System.out.println("Autoboxing: " + j);
	        int k=j.intValue();//AutoUnboxing
	        System.out.println("AutoUnboxing: "+ k);
	        int l=i;//Autounboxing
	        System.out.println(l);
	        String a="10";
	        Integer b=Integer.valueOf(a);//String to Wrapper object
	        System.out.println("String to Wrapper Object: "+ b);
	       Integer c=80;
	       String d=c.toString();
	        System.out.println("Wrapper object to string: "+ d);//wrapper object to String
          int e= b.intValue();
          System.out.println("wrapper object to primitive type: "+ e);//wrapper object to primitive type
          Integer f=Integer.valueOf(e);
          System.out.println("primitive type to Wrapper object: "+f);//primitive type to Wrapper object
          int g =Integer.parseInt(a);
          System.out.println("String to primitive type:"+ g);//String to primitive type
          String h=Integer.toString(e);
          System.out.println("Primitive type to String: "+ h);//primitive type to string
                      
	}

}
