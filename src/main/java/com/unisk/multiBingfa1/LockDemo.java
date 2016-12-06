package com.unisk.multiBingfa1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
	public static void main(String[] args) {
		new MT().start();
		new MT().start();
		new MT().start();
		new MT().start();
	}
}
class Data{
	static int i=0;
	static Lock lock = new ReentrantLock();
	//static AtomicInteger ai = new AtomicInteger();
	static void operate(){//或者这里加个synchronized
		//System.out.println(ai.incrementAndGet());
		lock.lock();
		i++;
		System.out.println(i);
		lock.unlock();
	}
}
class MT extends Thread{
	public void run(){
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Data.operate();
		}
	}
}