package com.java.basiccode;

import java.util.ArrayList;

public class StringDelimiter {
static int count=0;

public static void main(String[] args) {
		// TODO Auto-generated method stub
String input ="hello_hi_how_are_you";

char[] temp=input.toCharArray();

ArrayList<String> al=new ArrayList<String>();

String temp1 ="";

for(int i=0;i<temp.length;i++)
{

 if(temp[i]!='_')
	 
 	{
	 temp1=temp1+temp[i];
	 al.add(temp1);
	 continue;
 	}
 else 
 	{
	
	// System.out.println(temp1);
 	}
}

for(String pt:al)
	System.out.println(pt);

	}

}
