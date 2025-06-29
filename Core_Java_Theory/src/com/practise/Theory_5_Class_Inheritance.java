package com.practise;

class RBIBank{
	int a;
	public RBIBank() {
		a=10;
		System.out.println("parent constructor");
		
	}
	
	public void savings() {
		System.out.println("this is savings account");
	}
	public void current() {
		System.out.println("this is current account");
	}
}
class HDFCBank extends RBIBank{
   public HDFCBank() {
	super();
	System.out.println(super.a);
		
	}
	public void demat() {
		System.out.println("this is Demat account");
	}
	public void savings() {
		System.out.println("savings account in HDFC bank");
	}
}

class ICICBank extends RBIBank{
	public void current() {
		System.out.println("current account in ICIc Bank");
	}
	public void womensAcc() {
		System.out.println("women account");
	}
}
	
public class Theory_5_Class_Inheritance {

	public static void main(String[] args) {

		HDFCBank hdfc=new HDFCBank();
		RBIBank rbi=new ICICBank();
		hdfc.savings();
		rbi.savings();
		//downcasting
		((ICICBank)rbi).womensAcc();
		
		
	}

}
