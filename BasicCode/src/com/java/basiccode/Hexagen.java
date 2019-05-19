// this question was asked in hexagen 
//to reach a particular number what is the minimun step we needed 
//condion is either it will multiply current elements by 2 or it will increment number by 1
//its started with 1 
//lenght of array will be the shortest length to reach the number

package com.java.basiccode;


import java.util.ArrayList;
import java.util.Scanner;


public class Hexagen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in);
		System.out.println("inter input as a number");
		int input =scanner.nextInt();
		
	//	int[] ar1= new int[input];
		
		ArrayList<Integer> ar=new ArrayList<>();
		
		int temp=1;
		
		ar.add(temp);
		
		
	//	int count=0;
		
	//	ar1[count]=1;
		
		
		
		while(temp<input)
		{
			//count++;
			if(temp*2<=input)
			{
			temp=temp*2;
			//ar1[count]=temp;
			ar.add(temp);
			//System.out.println(temp);
			
			}
			else
			{
				temp=temp+1;
				//ar1[count]=temp;
				ar.add(temp);
			//	System.out.println(temp);
			}
		}
		
		for(int out:ar)
			System.out.println(out);
		System.out.println("steps needed to reach is "+ar.size());
	}

}
