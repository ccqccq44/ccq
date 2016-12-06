package use;
public class FourThreadIncDec {  
	  
    private int j;  
  
    public static void main(String args[]) {  
  
    	FourThreadIncDec tt = new FourThreadIncDec();   
        Inc inc = tt.new Inc();    
        Dec dec = tt.new Dec();  
          
        Thread t1 = new Thread(inc);  
        t1.start();  
        Thread t2 = new Thread(dec);  
        t2.start();  
        
  
    }  
  
    private synchronized void inc() {  //锁住了类对象
        j++;  
        System.out.println(Thread.currentThread().getName() + "-inc:" + j);  
    }  
  
    private synchronized void dec() {  
        j--;  
        System.out.println(Thread.currentThread().getName() + "-dec:" + j);  
    }  
  
    class Inc implements Runnable {  
  
        public void run() {  
            for (int i = 0; i < 10; i++) {
            	inc();          	 
            }  
        }  
    }  
  
    class Dec implements Runnable {  
  
        public void run() {  
            for (int i = 0; i < 10; i++) {
            	dec();           	
            }  
        }  
    }  
  
}  
