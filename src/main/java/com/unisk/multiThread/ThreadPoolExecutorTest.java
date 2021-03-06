package com.unisk.multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {

//newCachedThreadPool可缓存线程池。如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
	/*public static void main(String[] args) {
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();  
		for (int i = 0; i < 10; i++) {  
			final int index = i;  
			try {  
				Thread.sleep(1000);  
			} catch (InterruptedException e) {  
				e.printStackTrace();  
			}  
			cachedThreadPool.execute(new Runnable() {  
				public void run() {  
					System.out.println(index);  
				}  
		   });  
		}  
	}*/

//newFixedThreadPool创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。	 
	 /*public static void main(String[] args) {  
		 ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);  
		 for (int i = 0; i < 10; i++) {  
			 final int index = i;  
			 fixedThreadPool.execute(new Runnable() {  
				 public void run() {  
					 try {  
						 System.out.println(index);  
						 Thread.sleep(2000);  
					 } catch (InterruptedException e) {  
						 e.printStackTrace();  
					 }  
				 }  
			 });  
		 }  
	 }  */
//newScheduledThreadPool创建一个定长线程池，支持定时及周期性任务执行。
	/*public static void main(String[] args) {  
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);  
		scheduledThreadPool.schedule(new Runnable() {  
			public void run() {  
				System.out.println("delay 3 seconds");  
		    }  
		}, 3, TimeUnit.SECONDS); //延迟3秒执行 
	}  */
	public static void main(String[] args) {  
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);  
		scheduledThreadPool.scheduleAtFixedRate(new Runnable() {  
			public void run() {  
				System.out.println("delay 1 seconds, and excute every 3 seconds");  
			}  
		  }, 1, 3, TimeUnit.SECONDS);  //延迟1秒后每3秒执行一次
	}  
	/*TimeUnit.DAYS;               //天
	TimeUnit.HOURS;             //小时
	TimeUnit.MINUTES;           //分钟
	TimeUnit.SECONDS;           //秒
	TimeUnit.MILLISECONDS;      //毫秒
	TimeUnit.MICROSECONDS;      //微妙
	TimeUnit.NANOSECONDS;       //纳秒	
*///newSingleThreadExecutor创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
	/*public static void main(String[] args) {  
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();  
		for (int i = 0; i < 10; i++) {  
		    final int index = i;  
		    singleThreadExecutor.execute(new Runnable() {  
		    	public void run() {  
		    		try {  
		    			System.out.println(index);  
		    			Thread.sleep(2000);  
		    		} catch (InterruptedException e) {  
		    			e.printStackTrace();  
		    		}  
		    	}  
		    });  
		}  
	} */
	
	
	
}
