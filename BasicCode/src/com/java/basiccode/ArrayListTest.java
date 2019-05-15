package com.java.basiccode;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList ar1=new ArrayList();
	ArrayList ar2=new ArrayList();
	
	
	ar1.add(10);
	ar1.add("shyam");
	
	ar2.add(15);
	ar2.add("Babu");
	
for(int i=0;i<ar1.size();i++)
{
System.out.println(ar1.get(i));	

}


for(int i=0;i<ar2.size();i++)
{
System.out.println(ar2.get(i));	

}
	

/*Iterator itr =ar1.iterator();

while(itr.hasNext())
{
System.out.println(itr.next());	
}

Iterator itr1 =ar2.iterator();

while(itr1.hasNext())
{
System.out.println(itr1.next());	
}



ar1.addAll(ar2);

for(int i=0;i<ar1.size();i++)
{
System.out.print(ar1.get(i));	
}


ar1.retainAll(ar2);
ar1.add(20);

for(int i=0;i<ar1.size();i++)
{
System.out.println(" "+ar1.get(i));	
}

*/
/*ar1.remove("shyam");
for(int i=0;i<ar1.size();i++)
{
System.out.println(ar1.get(i));	

}

ar2.remove(0);
for(int i=0;i<ar2.size();i++)
{
System.out.println(ar2.get(i));	

}

*/



}
}