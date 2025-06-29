package com.Linkedin;

public class SingleDimArray {

	public static void main(String[] args) {
		int a[]= {100,200,300,400,500,600};
		System.out.println("length of the array: "+a.length);
		for(int i:a) {
			System.out.print(i +" ");
		}
		System.out.println();
		System.out.println("*********************************");
		for(int i:a) {
			if(i==400) {
				break;
			}
			System.out.println(i);
		}
	}

}
