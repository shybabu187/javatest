package com.java.basiccode;

import java.util.Comparator;

public class AgeComprator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		StudentComprator s1=(StudentComprator)o1;
		
		StudentComprator s2 =(StudentComprator)o2;
		
		if(s1.age==s2.age)
		return 0;
		
		else if(s1.age>s2.age)
			return 1;
		else 
			return -1;
	}

}
