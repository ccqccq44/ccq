package ccq;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import com.alibaba.fastjson.JSONObject;





public class Snippet {
	public static void main(String[] args) {
		/*Map<String, JSONObject> dataMap = new HashMap<String,JSONObject>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");		
		Date tempDate = new Date();
		for (int i = 0; i < 7; i++) {        
			JSONObject jsonObject = new JSONObject();
			String x = dateFormat.format(tempDate); 
			jsonObject.put("x", x);			
			jsonObject.put("z", 0);        
			tempDate=new Date(tempDate.getTime()-86400000L);
			dataMap.put(x, jsonObject);
		}
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("x","2016-10-28");
		jsonObject.put("z",90);
		dataMap.put("2016-10-28", jsonObject);
		System.out.println(dataMap);*/
		HashSet h=new HashSet();
		h.add("你好");
		h.add("你好");
		System.out.println(h);
	}
}

