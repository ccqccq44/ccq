package ccq;


public class ObjectIncrement {

	public static void main(String[] args) {
		Counter a=new Counter();
		System.out.println(a.increment());
		System.out.println(a.anotherIncrement());
		Counter b=new Counter();
		System.out.println(b.increment());
	}
}
class Counter{
	private static int count=0;//022
	//private int count=0;//020
	public int increment(){
		return count++;
	}
	public int anotherIncrement(){
		return ++count;
	}
}
