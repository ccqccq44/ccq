package com.unisk.ccq.basic;

class Test0 {
	public static String staticField = "父类-静态变量";
	public String field = "父类-普通变量";
	public Test0() {
		System.out.println("父类-构造器");
	}
	static {
		System.out.println(staticField);
		System.out.println("父类-静态初始化块");
	}
	{
		System.out.println(field);
		System.out.println("父类-初始化块");
	}
}
public class JavaExecutionSequence extends Test0{
	public static String staticField = "子类*静态变量";
	public String field = "子类*普通变量";
	static {
		System.out.println(staticField);
		System.out.println("子类*静态初始化块");
	}
	{
		System.out.println(field);
		System.out.println("子类*初始化块");
	}
	public JavaExecutionSequence() {
		System.out.println("子类*子类构造器");
	}
	public static void main(String args[]) {
		System.out.println("main方法");
		new JavaExecutionSequence();
	}
}