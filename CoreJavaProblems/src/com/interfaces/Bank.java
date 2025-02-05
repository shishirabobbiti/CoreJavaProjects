package com.interfaces;
interface IRBI{
	void withDrawMoney();
	void createAccount();
}

class HDFCImpl implements IRBI{
	public void withDrawMoney(){
		System.out.println("Can withdraw only 50k");
	}
	public void createAccount(){
		System.out.println("Can have only 2 accounts");
	}

}

public class Bank{
	public static void main(String[] args){
		IRBI hdfc=new HDFCImpl();
		hdfc.withDrawMoney();
		
	}

}