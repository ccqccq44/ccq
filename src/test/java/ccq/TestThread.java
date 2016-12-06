package ccq;
class ThreadDemo extends Thread {
	
	public void run() {
	    /*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	    System.out.println("run");
	}
}
public class TestThread {
	public static void main( String[] args) {
	   ThreadDemo thread1=new ThreadDemo();	   
	   thread1.start();
	   System.out.println("main");
	   
	}
}