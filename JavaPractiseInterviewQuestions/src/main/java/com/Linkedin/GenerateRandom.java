package com.Linkedin;

import java.util.Random;

public class GenerateRandom {

	public static void main(String[] args) {
		Random r=new Random();
		for(int i=0;i<5;i++) {
			//System.out.println(r.nextInt(100));
			System.out.println((int)(Math.random()*100));
		}
	}

}
