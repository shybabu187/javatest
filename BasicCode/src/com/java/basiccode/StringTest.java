package com.java.basiccode;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="hello";
		String test1=new String("hello");
		
		boolean t=test==test1;
		System.out.println(t);
		
		boolean t1 =test.equals(test1);
		
		System.out.println(t1);
	}

}
