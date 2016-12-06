package com.unisk.ccq.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;


/**
 * 发短信!
 *
 * */
public class SendMessage
{
	
	public static String getURL(ShortMessageLog sml) {		
		String URL = "http://220.194.63.59:8030/Submit%20CommandId=123&Name=dxby_wmp&Pwd=dx@[2016]&GateName=openet&ItemId=601&SpNumber=10655581&UserNumber="+sml.getPhone()+"&UserNumberType=0&FeeType=1&ReportFlag=1&MsgCode=15&msg:="+sml.getContent()+"&ItemType=0&MsgId="+sml.getTime().toString();
		return URL;
	}	

	public static void send(ShortMessageLog sml) throws IOException {
    	String URL = getURL(sml);
		String result = "";
		BufferedReader in = null;			
		
			URL realUrl = new URL(URL);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 建立实际的连接
			conn.connect();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line = in.readLine();
			if (line.contains("Received")) {
				result = "0";
				//TODO 发送成功就记录到redis 里
			} else {
				result = "1";
			}			
	
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
			
			}
		return;
	}

	/** 
	　　* 加密
	　　*/  
	public static String EncodeSmsContent(String src) {

		byte[] bytes;
		try {
			bytes = src.getBytes("GBK");
		} catch (UnsupportedEncodingException e) {
			return null;
		}

		StringBuffer reValue = new StringBuffer();
		StringBuffer tem = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			tem.delete(0, tem.length());
			tem.append(Integer.toHexString(bytes[i] & 0xFF));
			if (tem.length() == 1) {
				tem.insert(0, '0');
			}
			reValue.append(tem);
		}
		return reValue.toString().toUpperCase();
	}

	/** 
	 * 解密
	　　*/ 
	public static String DecodeSmsContent(String src) {
		byte[] bytes = new byte[src.length() / 2];

		for (int i = 0; i < src.length(); i += 2) {
			bytes[i / 2] = (byte) (Integer.parseInt(src.substring(i, i + 2), 16));
		}
		String reValue;
		try {
			reValue = new String(bytes, "GBK");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
		return reValue;
	}		
	
	public static void main(String[] args) throws IOException {
		String content = EncodeSmsContent("测试");  //短信内容加密    
    	ShortMessageLog sml = new ShortMessageLog();
		sml.setPhone("18596662380");
		//sml.setPhone("18612135488");//云亓电话
		sml.setContent(content);				
		sml.setTime("lizheng");			    
		send(sml);
	}

	
}
