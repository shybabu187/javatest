package com.java.basiccode;

import java.util.Scanner;

public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]=new int[4];
		
		Scanner s=new Scanner(System.in);
		System.out.println("inter input !!!!\n");
		for(int i=0;i<array.length;i++)
			{
			array[i]=s.nextInt();
			
			}
		
		System.out.println("input intered as !!!!");
		for(int value:array)
		{
			System.out.print(" "+value);
		}
		int last=array.length-1;
		for(int a=0;a<array.length/2;a++) 
		{
			int temp=array[a];
			array[a]=array[last];
			array[last]=temp;
			last--;
		}	
		System.out.println("\n after swap !!!!");
		for(int value:array)
		{
			System.out.print(" "+value);
		}
	}

}
