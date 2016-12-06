package com.unisk.multiBingfa1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//执行器   Callable Future线程执行完有返回值
public class ExecutorDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Integer> r1=es.submit(new MC(1,5));
		Future<Integer> r2=es.submit(new MC(6,10));
		System.out.println(r1.get()+":"+r2.get());
		es.shutdown();
	}
}
class MC implements Callable<Integer>{
	private int begin,end;
	public MC(int begin,int end){
		this.begin=begin;
		this.end=end;
	}
	public Integer call() throws Exception{
		int sum=0;
		for (int i = begin; i < end; i++) {
			sum+=i;
			System.out.println("sum的值为："+sum);
		}
		return sum;
	}
}
