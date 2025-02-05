package com.hasARelationship;

public class Address {
	
	int hNo;
	String mandal;
	String district;
	int pincode;
	
	public Address(int hNo, String mandal, String district, int pincode) {
		this.hNo = hNo;
		this.mandal = mandal;
		this.district = district;
		this.pincode = pincode;
	}
	
	public void addressInCollege() {
		System.out.println("Student is from "+district+" district");
	}

	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", mandal=" + mandal + ", district=" + district + ", pincode=" + pincode + "]";
	}

}
