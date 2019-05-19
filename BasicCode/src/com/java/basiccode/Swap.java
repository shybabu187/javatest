package com.java.basiccode;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in);
		
		int a=input.nextInt();
		int b=input.nextInt();
		
		System.out.println("before swap :"+a+" "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap :"+a+" "+b);
		
		
		
	}

}
