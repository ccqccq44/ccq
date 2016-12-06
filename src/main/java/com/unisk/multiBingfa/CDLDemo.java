package com.unisk.multiBingfa;

import java.util.concurrent.CountDownLatch;
//计数闩       必须发生指定数量的事件后才可以继续运行（三个人赛跑，喊3,2,1之后一起跑）
public class CDLDemo {	
	public static void main(String[] args) {
		CountDownLatch countDownLatch=new CountDownLatch(3);
		new Racer(countDownLatch, "A").start();
		new Racer(countDownLatch, "B").start();
		new Racer(countDownLatch, "C").start();
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(3-i);
			countDownLatch.countDown();
			if(i==2)
				System.out.println("start");
		}		
	}
}

class Racer extends Thread{
	private CountDownLatch countDownLatch;
	public Racer(CountDownLatch countDownLatch,String name){
		setName(name);
		this.countDownLatch=countDownLatch;
	}
	public void run(){
		try {
			countDownLatch.await();
			for (int i = 0; i < 3; i++) {
				System.out.println(getName()+":"+i);				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}




