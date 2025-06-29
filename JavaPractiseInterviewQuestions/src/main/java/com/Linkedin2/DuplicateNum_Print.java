package com.Linkedin2;

import java.util.HashSet;

public class DuplicateNum_Print {

	public static void main(String[] args) {
		int [] num= {2,4,5,2,4,6,8,3,2};
		int count=0;
		HashSet<Integer> set=new HashSet<Integer>();	
		for(int i=0;i<num.length;i++) {
			if(!set.add(num[i])) {
				System.out.println("Duplicate numbers :" +num[i]);
				count++;
			}
		}
		System.out.println("Duplicate number count is: "+count);
		System.out.println("WithOut Duplicate Numbers: "+set);
	}

}
