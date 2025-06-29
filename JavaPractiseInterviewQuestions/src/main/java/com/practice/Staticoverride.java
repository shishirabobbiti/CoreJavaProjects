package com.practice;

class Staticoverride {

public static void main(String[] args) {
	
	Prabhakar p=new Shishira();
	p.caring();
		
	}

}

class Shishira extends Prabhakar{
	
//	public void caring() {
//		System.out.println("Shishira Caring");
//	}

}
 
 class Prabhakar{
	
	public static void caring(){
		System.out.println("Prabhakar Caring");
	}
	
	
}