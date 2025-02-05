package com.practise;
public class StringConcept1{
	
	public static void main(String[] args){
	String s1="Mike";
	String s2=new String("Mikes");
	String s3=s1;
	s1.concat(s2);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1==s3);
	System.out.println(s1.equals(s2));
	String s="sachin";
	s.concat("tendulkar");
	s=s.concat("ind");
	s="sachintendulkar";
	System.out.println(s);
	String s4;
	}
}
//Mike
//Mikes
//true
//false
//sachintendulkar