package com.unisk.ccq.test;

import com.unisk.ccq.util.TimeFormatUtil;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string();
		stringBuffer();
		stringBuilder();
	}
	
	public static void string(){
		System.out.println("String开始时间："+TimeFormatUtil.getNowTimeString());
		String s =  new String();
		for(int i=0;i<10000;i++){
			s+=i;
		}
		System.out.println("String结束时间："+TimeFormatUtil.getNowTimeString());	
	}
	
	public static void stringBuffer(){
		System.out.println("StringBuffer开始时间："+TimeFormatUtil.getNowTimeString());
		StringBuffer sb =  new StringBuffer();
		for(int i=0;i<10000;i++){
			sb.append(i);
		}
		System.out.println("StringBuffer结束时间："+TimeFormatUtil.getNowTimeString());	
	}
	
	public static void stringBuilder(){
		System.out.println("stringBuilder开始时间："+TimeFormatUtil.getNowTimeString());
		StringBuilder sb =  new StringBuilder();
		for(int i=0;i<10000;i++){
			sb.append(i);
		}
		System.out.println("stringBuilder结束时间："+TimeFormatUtil.getNowTimeString());	
	}

}
