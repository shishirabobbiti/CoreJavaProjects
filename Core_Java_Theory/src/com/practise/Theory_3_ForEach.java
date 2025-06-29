package com.practise;

public class Theory_3_ForEach {

	public static void main(String[] args) {
		
		int[] a= {10,20,30,40};
		String[] b= {"Mike","Shishi"};
		char[] c= {'a','b','c'};
//		for(int i=0;i<a.length;i++) {
//			int k=a[i];
//			System.out.println(k);
//		}
		
		for(int k:a) {
			System.out.println(k);
		}
		
//		for(int j=0;j<b.length;j++) {
//			System.out.println(b[j]);
//		}
//		
		for(String i:b) {
			System.out.println(i);
		}
		
//		for(int k=0;k<c.length;k++) {
//			System.out.println(c[k]);
//		}
		
		for(char x:c) {
			System.out.println(x);
		}		

	}

}
