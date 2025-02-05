package com.practise;
class Parent4{

	public Parent5 getParent2Object(){
		System.out.println("Parent getParent2Object method");
		Parent5 p2=new Parent5();
		return p2;
	}

	public String getText(){
		return "Parent1";
	}
}

class Child4 extends Parent4{

	//public Parent2 getParent2Object(){
	//	Parent2 p2=new Parent2();
	//	return p2;
	//}

	public Child5 getParent2Object(){
		return new Child5();
	}

}

class Parent5{	

	public void helloWorld(){
		System.out.println("Hello");
	}

}




class Child5 extends Parent5{

}


public class RulesToOverride{

	public static void main(String[] shishira){
		Parent4 p1=new Parent4();
		String value=p1.getText();
		System.out.println(value);
		Parent5 p2=p1.getParent2Object();
		p2.helloWorld();
		Parent4 p3=new Child4();
		p3.getParent2Object().helloWorld(); 
		Child4 c1=new Child4();
		Child5 p4=c1.getParent2Object();
		p4.helloWorld();
				
		
	}

}