package com.unisk.ccq.test;

import java.util.LinkedList;
import java.util.List;

public class Jd {
	public static void main(String[] args) {
		System.out.println("f()的值"+f(20));
		System.out.println("g()的值"+g(20));
	}
	
	
	public static int f(int m){
		int s=0;
		while(m != 0)    
        {    
           int b = m % 10;    
            m = m / 10;    
            s = s + b;    
        }
		return s;    		
	}
	
	public static int g(int m){
		 String aString= Integer.toBinaryString(m);
		 String[] temp = aString.split(" ");//以空格拆分字符串
		 int[] result = new int[temp.length];//int类型数组
		 int b=0;
		 for(int i=0;i<temp.length;i++){
		    result[i] = Integer.parseInt(temp[i]);//整数数组
		 }
		 for(int i=0;i<result.length;i++){
			 b=b+(int)aString.charAt(i);
		 }
		 return b;
	}

}
