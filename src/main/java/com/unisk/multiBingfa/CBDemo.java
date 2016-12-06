package com.unisk.multiBingfa;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
//循环屏障  适用于只有多个线程都到达预定点时才可以继续执行（斗地主）
public class CBDemo {
	public static void main(String[] args) {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3,new Runnable() {		//三个人都准备好了就开始	
			public void run() {
				System.out.println("Game start");				
			}
		});
		new Player(cyclicBarrier, "A").start();
		new Player(cyclicBarrier, "B").start();
		new Player(cyclicBarrier, "C").start();
	}

}
class Player extends Thread{
	private CyclicBarrier cyclicBarrier;
	public Player(CyclicBarrier cyclicBarrier,String name){
		setName(name);
		this.cyclicBarrier=cyclicBarrier;
	}
	public void run(){
		System.out.println(getName()+" is waiting----");
		try {
			cyclicBarrier.await();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}