package com.convertcsvdataintojavaobjects;

// Define a Student class to hold student details
class Student {
	// Declare fields for student details
	private int id;
	private String name;
	private int age;

	// Constructor to initialize a Student object
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// Override the toString() method to return a formatted student string
	@Override
	public String toString() {
		return "Student ID: " + id + ", Name: " + name + ", Age: " + age;
	}
}
