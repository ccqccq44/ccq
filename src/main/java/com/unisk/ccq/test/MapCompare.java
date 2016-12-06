package com.unisk.ccq.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testHashMap();
		testTreeMap();
	}
	
	public static void testHashMap(){
		Map<String, String> map = new HashMap<String, String>();
	
		map.put("appid","izmZlaj6DSyE8Lns");
		map.put("timestamp","t");
		map.put("v","3.0");
		map.put("nonce", "n");
		map.put("echostr", "e");
		System.out.println(map);
	}
	
	public static void testTreeMap(){
		Map<String, String> map = new TreeMap<String, String>();	
		map.put("appid","izmZlaj6DSyE8Lns");
		map.put("timestamp","t");
		map.put("v","3.0");
		map.put("nonce", "n");
		map.put("echostr", "e");
		System.out.println(map);
	}

}
