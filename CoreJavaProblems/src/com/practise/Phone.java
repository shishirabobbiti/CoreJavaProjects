package com.practise;
class Ph{
	private String color;
	private int size;
	private int noofCameras;
	public void call(){
	System.out.println("Calls");
	}
	public void toUseInternet(){
	}
	void setColor(String color){
	 this.color=color;
	}
	String getColor(){
	return color;
	}
}

public class Phone{

	public static void main(String[] args){
		

	Ph p=new Ph();
	p.setColor("Black");
	String result=p.getColor();
	p.call();
	System.out.println(result);
	}
}