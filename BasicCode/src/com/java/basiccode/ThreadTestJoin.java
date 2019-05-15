package com.java.basiccode;

public class ThreadTestJoin extends Thread{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isDaemon());
		
		/*for(int i=0;i<5;i++)
			System.out.println(i);
		System.out.println(Thread.currentThread().getName());*/
		/*try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadTestJoin tt1=new ThreadTestJoin();
ThreadTestJoin tt2=new ThreadTestJoin();
ThreadTestJoin tt3=new ThreadTestJoin();

//System.out.println("name of thread one is "+tt1.getName());
//System.out.println("id of thread one is "+tt1.getId());

//System.out.println("name of thread two is "+tt2.getName());
//System.out.println("id of thread two is "+tt2.getId());

//System.out.println("name of thread 3 is "+tt3.getName());
//System.out.println("id of thread 3 is "+tt3.getId());

tt1.setPriority(MIN_PRIORITY);
tt2.setPriority(MAX_PRIORITY);
tt3.setPriority(NORM_PRIORITY);

tt1.setDaemon(true);
tt1.start();
/*try {
	tt1.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}*/

tt2.start();
tt3.start();


/*tt1.setName("This is Thread one");
System.out.println(tt1.getName());*/

	}

}
