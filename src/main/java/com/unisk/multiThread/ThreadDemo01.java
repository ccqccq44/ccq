package com.unisk.multiThread;
public class ThreadDemo01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread("A");
		MyThread t2=new MyThread("B"); 
		t1.start();
		t2.start();
	}
	/*public static void main(String[] args) {
		MyRunnable r1=new MyRunnable("A");
		MyRunnable r2=new MyRunnable("B");
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
	}*/
}
