package use;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class A{
	public A(){System.err.println("我是A");}
	public void tell1() {
		System.out.println("A--tell1");
	}
	public void tell2() {
		System.out.println("A--tell2");
	}
}
class B extends A{
	public B(){System.err.println("我是B");}
	public void tell1() {
		System.out.println("B--tell1");
	}
	public void tell3() {
		System.out.println("B--tell3");
	}
}


public class UpTransitionDownTransition {
		
	public static void main(String[] args) {
		//向上转型		
		A a = new B();
		a.tell1();
		a.tell2();
		//向下转型   先实现向上转型
		/*A a = new B();
		B b=(B)a;
		b.tell1();
		b.tell2();
		b.tell3();*/
	
	}
}
