package com.interfaces;
interface IManager{

	void noOfRTO(String name);
	void completeAssociateCertification(String name);

}

abstract class TeamLead implements IManager {
	String name;
	public TeamLead(String name){
	this.name=name;
	}
	public void noOfRTO(String name){
		System.out.println(name + " RTO 2 Days");
	}
	//public void completeAssociateCertification();
}
class Associate1 extends TeamLead{
	public Associate1(String name){
		super(name);
	}
	public void completeAssociateCertification(String name){
		System.out.println(name+ " Completed Certifications");
	}
} 
class Associate2 extends TeamLead{
	public Associate2(String name){
		super(name);
	}
	public void completeAssociateCertification(String name){
		System.out.println(name + " Not Completed Certifications");
	}
} 


public class Employee{ 
	public static void main(String[] args){
		TeamLead a1=new Associate1("Soundarya");
		TeamLead a2=new Associate2("Vaishnavi");
			a1.completeAssociateCertification(a1.name);
			a1.noOfRTO(a1.name);
			a2.completeAssociateCertification(a2.name);
			a2.noOfRTO(a2.name);
		
	}
}


