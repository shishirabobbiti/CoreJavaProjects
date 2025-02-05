package com.practice;

public class Numbers {
    static int num=0;
	public static void main(String[] args) {
		printNum();
		

	}
	public static void printNum()
	{
		if(num<=100) {
			System.out.println(num);
			num++;
			}
		if(num>100) {
			return;
		}
		printNum();
		
	}
//
//    public static void main(String[] args) {
//    	printNum(1);
//    	
//    }
//    public static void printNum(int num) {
//    	if(num<=100) {
//    		System.out.println(num);
//    		num++;
//    		printNum(num);
//    	}
//    }
}
