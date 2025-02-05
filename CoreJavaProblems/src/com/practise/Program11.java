package com.practise;
class Student{

	String sname;
	int sage;
	int sid;
	int grade;
	String school;
	int marksInMaths;

	void study(){
		if(marksInMaths>90)
			System.out.println(sname+ " studies hard");
		else
			System.out.println(sname+" not studying hard");
	}

	void play(){
		System.out.println(sname+" is playing in the garden..");
	}

	void marks(){
		System.out.println(sname+" marks in Maths::"+marksInMaths);
	}

}


public class Program11{
	public static void main(String[] args){
	
	//ClassName objName= new ClassName();
	Student s1=new Student();
	s1.sname="Shishira";
	s1.sage=16;
	s1.sid=123;
	s1.grade=7;
	s1.school="St Mary";
	s1.marksInMaths=98;
	System.out.println(s1.sname+" has got "+s1.marksInMaths+" in maths.");
	s1.play();
	s1.study();

	Student s2=new Student();
	s2.sname="Maruthi";
	s2.sage=15;
	s2.sid=124;
	s2.grade=6;
	s2.school="Tawakkal";
	s2.marksInMaths=88;

	System.out.println(s2.sname+" has got "+s2.marksInMaths+" in maths.");
	s2.play();
	s2.study();
		
	}

}