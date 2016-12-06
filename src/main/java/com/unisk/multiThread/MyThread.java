package com.unisk.multiThread;

public class MyThread extends Thread{
	
	private String name;
	
	public MyThread(String name){//构造方法
		this.name=name;
	}
	
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println(name+":"+i);
		}	
	}

}
