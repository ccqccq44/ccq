package com.unisk.multiBingfa;

import java.util.concurrent.Phaser;


//模拟饭店服务，传菜、厨师、上菜

public class PhDemo {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(1);//一个线程进入phaser
		System.out.println(" starting...");
		new Worker(phaser, "服务员").start();
		new Worker(phaser, "厨师").start();
		new Worker(phaser, "上菜").start();
		for (int i = 1; i <= 3; i++) {
			phaser.arriveAndAwaitAdvance();
			System.out.println("Order "+i+" finished!");
		}
		phaser.arriveAndDeregister();
		System.out.println("All Done");
	}
}
class Worker extends Thread{
	private Phaser phaser;
	public Worker(Phaser phaser,String name){
		this.setName(name);
		this.phaser=phaser;
		phaser.register();//线程注册到phaser里边来
	}
	public void run(){
		for (int i = 0; i < 3; i++) {//模拟三个订单
			System.out.println("current order is: "+i+" : "+getName());
			if(i==3){
				phaser.arriveAndDeregister();//到达时注销线程，即从phaser中解除自己
			}else{
				phaser.arriveAndAwaitAdvance();//到达时等待其他线程到达
			}
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
