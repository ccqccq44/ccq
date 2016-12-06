package com.unisk.multiBingfa1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class ForkJoinDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		Future<Long> result = forkJoinPool.submit(new MTask(0, 100000));
		System.out.println(result.get());
		forkJoinPool.shutdown();

	}
}
class MTask extends RecursiveTask<Long>{
	static final int THRESHOLD=1000;
	private int begin,end;
	public MTask(int begin,int end){
		this.begin=begin;
		this.end=end;
	}
	protected Long compute() {
		long sum=0;
		if((end-begin)<=THRESHOLD){
			for (int i = begin; i < end; i++) {
				sum+=i;
			}
		}else{
			int mid=(begin+end)/2;
			MTask left=new MTask(begin, mid);
			left.fork();
			MTask right=new MTask(mid+1, end);
			right.fork();
			
			Long lr=left.join();
			Long rr=right.join();
			
			sum=lr+rr;
			
		}
		return sum;
	}
}
