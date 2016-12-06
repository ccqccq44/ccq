package com.unisk.multiThread;

class Data2{
	int i;
	public void add() {
		synchronized (this) {
			i++;
			if(i%5==0)
				notifyAll();
		}
		
	}
	
	public void sub() {
		synchronized (this) {
			try {
				this.wait();
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			System.out.println("before:"+i);
			i-=5;
			System.out.println("after:"+i);
		}
	}
}

class Consumer extends Thread{
	Data2 data2;
	Consumer(Data2 data2){
		this.data2=data2;
	}
	public void run(){
		while(true) data2.sub();
	}
}
class Producer extends Thread{
	Data2 data2;
	Producer(Data2 data2){
		this.data2=data2;
	}
	public void run(){
		while(true) data2.add();
	}
}

public class ThreadDemo06 {
	
	public static void main(String[] args) {
		Data2 d = new Data2();
		new Producer(d).start();
		new Consumer(d).start();

	}

}
