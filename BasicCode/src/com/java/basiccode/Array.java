package com.java.basiccode;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array ar=new Array();
		ar.testarray();
	}
public void testarray() {
	
	/*int array[]=new int[5];
	
	for(int i=0;i<5;i++)
		{
		array[i]=i;
		}
	
	//for each loop
	for(int array1:array)
	{
		System.out.println(array1);
	}
	*/
	
	//matrix addition 
	
	
	int num1[][]=new int[3][3];
	int num2[][]=new int[3][3];
	int sum[][]=new int[3][3];
	
	for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		{
		num1[i][j]=i+j;
		num2[i][j]=i+j;
		sum[i][j]=num1[i][j]+num2[i][j];
		//System.out.println(sum[i][j]);
		}
		}
	
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	{
	System.out.print(sum[i][j]);
	}
	System.out.println("\n");
	}
	
	
	}
}
