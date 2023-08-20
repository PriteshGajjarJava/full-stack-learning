package com.pga.jdbc;

// POJO - Plain Old Java Object
public class Student {
	private int id;
	private String name;
	private float marks;

	public Student() {}
	
	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return "[" + this.id +"," + this.name +"," + this.marks +"]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	
}
