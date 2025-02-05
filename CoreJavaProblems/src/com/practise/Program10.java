package com.practise;
public class Program10{
	public static void main(String[] args){
		int i=0;
		while(i<=10){               
			if(i==4){
				i=i+2;
				continue;
			}
			else if(i==8){
				break;
			}
			System.out.println(i);
			i=i+2;				
		}
	}
}