package com.unisk.ccq.service;

import java.util.HashMap;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.Gson;



public class SendUSSD {
	private static final Logger logger = LoggerFactory.getLogger(SendUSSD.class);
	
	public static void invokeUSSD(String request) throws Exception{			
		HttpClient client = HttpClients.createDefault();
		RequestConfig requestConfig = RequestConfig.custom()
				.setSocketTimeout(20000).setConnectTimeout(20000).build();// 设置请求和传输超时时间	
		HttpPost httpPost = new HttpPost("https://api.wo.cn/service/ussd/sendMsg");   //此接口不用匹配任何内容
		httpPost.setConfig(requestConfig);													 
		httpPost.addHeader("Authorization", "Basic NWFlMzdlMTBkNDRiNDA5OGJkM2ZkNzdlZGZhODU4YTk6NDc4aTk0Rzk3TXpzVkJIMg==");
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
	public static void reqBody(String mobile,String content,int telcomType) throws Exception{
		HashMap<String, Object> map =new  HashMap<String, Object>();
		map.put("mobile",mobile);
		map.put("content",content);
		map.put("telcomType",telcomType);
		invokeUSSD(new Gson().toJson(map));
	}
	
	public static void main(String[] args) throws Exception {
		//reqBody("18612135488", "测试", 1);云亓手机
		//reqBody("15201327442", "ccq测试", 2);
		reqBody("18596662380", "ccq测试", 1);
	}
	
	
	
	
}
