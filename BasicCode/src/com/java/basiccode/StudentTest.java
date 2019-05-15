package com.java.basiccode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Student> al =new ArrayList<Student>();
	
	al.add(new Student(101,"Vijay",23));
	al.add(new Student(106,"Ajay",27));  
	al.add(new Student(105,"Jai",21)); 
	
	Collections.sort(al);
	
	for(Student st:al)
		System.out.println(st.roll +" "+st.name+ " "+st.age);
	}

}
