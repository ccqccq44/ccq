package com.unisk.ccq.arithmetic;

public class ReverseStringSort {

	public static void main(String[] args) {
		String aString = "abcdef";
		String bString="";
		for(int i=aString.length()-1;i>=0;i--){
			bString+=aString.charAt(i);
		}
		System.out.println(bString);
	}
}
