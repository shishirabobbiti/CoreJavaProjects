package com.practise;

public class Theory_7_Class_Has_A_Relationship_Person {
	
	String name;
	String company;
	String dob;
	Address adr[];
	public Theory_7_Class_Has_A_Relationship_Person(String name,String company,String dob,Address adr[]) {
		this.name=name;
		this.company=company;
		this.dob=dob;
		this.adr=adr;
		
	}
    public void personDetails() {
    	System.out.println(name+"is working in "+company+ "and date of Birth is "+dob);
    	for(Address a:adr) {
    		System.out.println("Hno::"+a.hno+","+"City:"+a.city+",State:"+a.state);
    	}
    	
    }
    
    public static void main(String[] args) {
    	Address adr1=new Address("87-776","kurnool","AP","518002");
    	Address adr2=new Address("celluiod","hitechcity","hyderabad","500083");
    	Address adr[]= {adr1,adr2};
    	Theory_7_Class_Has_A_Relationship_Person p=new Theory_7_Class_Has_A_Relationship_Person
    			("shishira","Accenture","March 10",adr);
    	p.personDetails();
    }
}
