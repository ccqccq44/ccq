package com.unisk.ccq.service;

import java.util.HashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.Gson;



public class ClientSendUSSD {
	private static final Logger logger = LoggerFactory.getLogger(ClientSendUSSD.class);
	
	public static void invokeUSSD(String request) throws Exception{			
		HttpClient client = HttpClients.createDefault();
		RequestConfig requestConfig = RequestConfig.custom()
				.setSocketTimeout(20000).setConnectTimeout(20000).build();// 设置请求和传输超时时间	
		HttpPost httpPost = new HttpPost("https://api.wo.cn/service/ussd/sendTemplateMsg");
		httpPost.setConfig(requestConfig);		
		httpPost.addHeader("Authorization", "Basic NjQ2ZmI3YjBkMzkzNGFiOWIzZjgxNTUzMWQwZGVhN2Y6MVQ5NEkzbTlJOXFQU2xZNA==");												 
		httpPost.addHeader("Content-Type", "application/json;charset=UTF-8");		
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("HTTPServer.content", request));				
		try {
			httpPost.setEntity(new StringEntity(request, "UTF-8"));
			//接收返回数据
			HttpResponse response = client.execute(httpPost);
			HttpEntity entity = response.getEntity();
			String result = EntityUtils.toString(entity,"UTF-8");
			logger.info("调用USSD返回的结果是："+result);					
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}			
	}
	public static void reqBody(String mobile,String content) throws Exception{
		HashMap<String, Object> map =new  HashMap<String, Object>();
		map.put("mobile",mobile);
		map.put("content","【中国平安】尊敬的中国平安客户，您好，本次致电为测试电话，请您接听（工号11）。");
		map.put("msgType",1);
		map.put("telcomType",1);
		//return new Gson().toJson(map);
		invokeUSSD(new Gson().toJson(map));
	}
	
	public static void main(String[] args) throws Exception {
		reqBody("18596662380", "12");
		//System.out.println("返回的是"+aString());
		
	}
	public static String aString(){					//	 646fb7b0d3934ab9b3f815531d0dea7f:1T94I3m9I9qPSlY4
		String authorString = Base64.encodeBase64String("646fb7b0d3934ab9b3f815531d0dea7f:1T94I3m9I9qPSlY4".getBytes());
		return authorString;
	}
	
	
	
}
