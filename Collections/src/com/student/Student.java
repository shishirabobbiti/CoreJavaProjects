package com.student;

public class Student {
	
	int sid;
	String sname;
	int standard;
	
	public Student(int sid, String sname, int standard) {
		this.sid = sid;
		this.sname = sname;
		this.standard = standard;
	}
	
	public void goingToSchool() {
		System.out.println(sname+" whose studying "+standard+" standard and student id is::"+sid+" is going to school");
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", standard=" + standard + "]";
	}

}
