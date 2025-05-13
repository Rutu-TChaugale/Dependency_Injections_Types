package com.sit.model;

public class Student {
	
	private int rollno;
	private String name;
	private String email;
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", email=" + email + "]";
	}


	public Student(int rollno, String name, String email) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
	}
	
	

}
