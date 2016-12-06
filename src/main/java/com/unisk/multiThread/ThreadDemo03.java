package com.unisk.multiThread;

class RunnableDemo implements Runnable{
	private String name;
	public RunnableDemo(String name){
		this.name=name;
	}	
	public void run() {
		/*for(int i=0;i<50;i++){
			System.out.println("当前线程对象："+Thread.currentThread().getName());
		}*/
		for(int i=0;i<10;i++){
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			System.out.println(name+":"+i);
			/*if(i==10){
				System.out.println("礼让");
				Thread.yield();
			}*/
		}	
	}	
}

public class ThreadDemo03 {

	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo("A");
		RunnableDemo r2 = new RunnableDemo("B");
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		/*RunnableDemo r = new RunnableDemo("A");
		Thread t = new Thread(r);
		//System.out.println("启动之前："+t.isAlive());
		t.start();*/
		//System.out.println("启动之后："+t.isAlive());
		/*for (int i = 0; i < 50; i++) {
			if(i>5){
				try {
					t.join();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			System.out.println("主线程："+i);
		}*/
	}

}
