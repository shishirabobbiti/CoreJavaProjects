package com.student;

public class Bike {
	
	int bNo;
	String bikeBrand;
	
	public Bike(int bNo, String bikeBrand) {
		this.bNo = bNo;
		this.bikeBrand = bikeBrand;
	}
	
	public void toSchoolOnBike() {
		System.out.println("Student is coming to school on "+bikeBrand);
	}

	@Override
	public String toString() {
		return "bNo=" + bNo + ", bikeBrand=" + bikeBrand + "]";
	}

}
