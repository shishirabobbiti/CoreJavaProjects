package com.student;

import java.util.Arrays;

public class StudentInfo {
	
	Student student;
	Book book[];
	Address address;
	Bike bike[];

	public StudentInfo(Student student, Book book[], Address address, Bike bike[]) {
		//para constructor
		this.student = student;
		this.book = book;
		this.address = address;
		this.bike=bike;
	}

	@Override
	public String toString() {
		return "StudentInfo [student=" + student + ", book=" + Arrays.toString(book) + ", address=" + address
				+ ", bike=" + bike + "]";
	}

	public void getStudentInfo() {
		System.out.println("Student Name is ::"+student.sname);
		for(int i=0;i<book.length;i++) {
			System.out.println("Student has book::"+book[i].bookName);
		}
		System.out.println("Student is from::"+address.district);
		for(int i=0;i<bike.length;i++) {
			System.out.println("Student has bike::"+bike[i].bikeBrand);
		}
	}


	public static void main(String[] args) {
		Student student = new Student(1234,"Shishira", 10) {
			
		};
//		Student student = new Student(1234,"Shishira", 10);
//		Book book1 = new Book(1, "Half Girlfriend", "Chetan Bhagat");
//		Book book2 = new Book(2, "Can Love Happen Twice", "Chetan Bhagat");
//		Book[] book={book1,book2};
//		Address address = new Address(589, "Kurnool", "Kurnool", 518002);
//		Bike bike1 = new Bike(1000, "Pept");
//		Bike bike2 = new Bike(4534, "R15");
//		Bike bike3 = new Bike(2000, "Vespa");
//		Bike[] bike= {bike1,bike2,bike3};
//		StudentInfo studentInfo = new StudentInfo(student, book, address,bike);
//		studentInfo.getStudentInfo();
		
	}

}
