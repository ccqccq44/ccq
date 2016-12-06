package com.unisk.multiThread;

class MyThreadDemo implements Runnable{
	
	private int ticket=5;
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			/*synchronized (this) {
				if(ticket > 0){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("车票："+ticket--);
				}	
			}*/
			tell();
		}
	}
	
	public synchronized void tell(){
		if(ticket > 0){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("车票："+ticket--);
		}	
	}
}
//死锁

public class ThreadDemo05 {

	public static void main(String[] args) {
		MyThreadDemo m = new MyThreadDemo();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		Thread t3 = new Thread(m);
		t1.start();
		t2.start();
		t3.start();
	}

}
