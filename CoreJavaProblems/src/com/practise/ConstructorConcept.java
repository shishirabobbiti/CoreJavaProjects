package com.practise;
public class ConstructorConcept{
	int x,y;
	public ConstructorConcept(){
		System.out.println("Calling Constructor");
	}
	public ConstructorConcept(int i){
		System.out.println(i);
	}
	public ConstructorConcept(int i,int j){		
		x=i;
		y=j;
		
	}
	public static void main(String[] args){
		ConstructorConcept cc=new ConstructorConcept(10,20);
		cc.add();
		
	}
	public void add(){
		int sum=0;
		sum=x+y;
		System.out.println(sum);	
	}
	

}