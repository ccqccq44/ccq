package com.unisk.ccq.controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONObject;

import com.unisk.ccq.pojo.Resp;
import com.unisk.ccq.redis.RedisAsPhoneList;
import com.unisk.ccq.service.SendUSSD;



@Controller
//@RequestMapping("/ccq")
//@Transactional
public class MyController {
	private static final Logger logger= LoggerFactory.getLogger(MyController.class);
	
	@ResponseBody      //测试
	@RequestMapping(value="/login",consumes={"application/json;charset=utf-8"},
	produces={"application/json;charset=utf-8"},method=RequestMethod.POST)
	public String  test(HttpServletRequest req,HttpServletResponse rep) throws Exception {	
		String reqBody = getRequestBody(req);
		JSONObject jsonObject=JSONObject.fromObject(reqBody);
		logger.info("前端发过来的"+reqBody);
		HttpSession session = req.getSession();
		session.setAttribute("nihao", "nihao1");
		//RedisAsPhoneList redisAsPhoneList = new RedisAsPhoneList getInstance();
		//System.out.println(RedisAsPhoneList.getInstance().pop40());
		//String id = jsonObject.getString("id");
		//System.out.println(id);
		return "success";
	}
	
	/*@ResponseBody      //测试
	@RequestMapping(value="/test1",consumes={"application/json;charset=utf-8"},
	produces={"application/json;charset=utf-8"},method=RequestMethod.POST)
	public String  test1(HttpServletRequest req,HttpServletResponse rep) throws Exception {	
		String reqBody = getRequestBody(req);
		HttpSession session = req.getSession();
		session.getAttribute("username");
		System.out.println("session获取:"+session.getAttribute("username1"));
		logger.info("前端测试是否相通1："+reqBody);
		return "success";
	}*/
	
	/*@ResponseBody      //测试
	@RequestMapping(value="/test",
	produces={"application/json;charset=utf-8"},method=RequestMethod.POST)
	public HashMap<String, Object>  test(HttpServletRequest req,HttpServletResponse rep) throws Exception {		
		String tel  = req.getParameter("tel").trim();
		logger.info("前端"+tel);
		HashMap<String , Object > hashMap =new HashMap<String, Object>();
		hashMap.put("success", "成功");
		return hashMap;
	}*/
	/*@ResponseBody      //测试
	@RequestMapping(value="/getPlaceList",method=RequestMethod.GET)
	public List<Map<String, Object>> test2(HttpServletRequest req,HttpServletResponse rep) throws Exception {
		float[] array={(float) 125.03, (float) 46.58};
		float[] array1={(float) 120.65, (float) 28.01};
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "大庆");
		map.put("geoCoord", array);
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("name", "温州");
		map1.put("geoCoord", array1);
		List<Map<String, Object>> placeList = new LinkedList<Map<String,Object>>();
		placeList.add(map);
		placeList.add(map1);
		System.out.println(placeList);
		return placeList;
	}*/
	/*@ResponseBody      //测试
	@RequestMapping(value="/getPlaceList",method=RequestMethod.GET)
	public List<Resp> test2(HttpServletRequest req,HttpServletResponse rep) throws Exception {
		double[] array={(double) 125.03, (double) 46.58};
		double[] array1={(double) 120.65, (double) 28.01};
		Resp resp = new Resp();
		resp.setName("大庆");
		resp.setGeoCoord(array);
		Resp resp1 = new Resp();
		resp1.setName("温州");
		resp1.setGeoCoord(array1);
		List<Resp> placeList = new LinkedList<Resp>();
		placeList.add(resp);
		placeList.add(resp1);
		System.out.println(placeList);
		return placeList;
	}*/
	
	
	
	private String getRequestBody(HttpServletRequest req) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(req.getInputStream()));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while((line = br.readLine())!=null){sb.append(line);}
        String reqBody = sb.toString();
		return reqBody;
	}
	
}
	
	
	
	