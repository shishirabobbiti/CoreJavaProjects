package com.collections;

public class EmployeeMap {
	int id;
	String name;

	
	public EmployeeMap(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "EmployeeMap [id=" + id + ", name=" + name + "]";
	}

}
