package com.java.basiccode;

public class Student implements Comparable<Student>{

	int roll;
	String name ;
	int age ;
	public Student(int roll, String name, int age) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		if(age==o.age)
		return 0;
		else if (age>o.age)
			return 1;
		else
			return -1 ;
			
		
		
	}
	
	
	
}
