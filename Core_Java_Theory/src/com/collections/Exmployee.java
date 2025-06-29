package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Exmployee {

	int id;
	String name;
	public Exmployee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		
		ArrayList<Exmployee> al=new ArrayList<Exmployee>();
		al.add(new Exmployee(1,"shishira"));
		al.add(new Exmployee(2,"Mike"));
		al.add(new Exmployee(3,"Prabha"));
		for(Exmployee e:al) {
			System.out.println(e.id +" "+e.name);
		}
		 
		 
	}
 
 
  
}
