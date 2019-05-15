package com.java.basiccode;

public class ThreadTest implements Runnable{


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread is running via Runnable ");
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadTest tt=new ThreadTest();

Thread t=new Thread(tt);

t.start();
	}
}
