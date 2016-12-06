package com.unisk.ccq.redis;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import redis.clients.jedis.Jedis;

public class RedisAsPhoneList implements RedisAsList {
	private static final Logger logger = LoggerFactory.getLogger(RedisAsPhoneList.class);
	private Jedis jedis;
	private String listName ="phonelist";
	private static final RedisAsPhoneList phoneList = new RedisAsPhoneList();

		private RedisAsPhoneList() 
	    { 
			 jedis = GetJedis.getInstance().getJedisPool().getResource();
	    } 
		public static RedisAsPhoneList  getInstance(){
			return phoneList;
		}
			    
	    public void push(String strs){
	    	jedis.lpush(listName, strs);
	    }
		    
	    public List<String> pop(){
	    	List<String> list=new LinkedList<String>();
	    	while (jedis.llen(listName)!=0) {
	    		//TODO SYSO
	    		logger.info("jedis.llen("+listName+") "+jedis.llen(listName));
				list.add(jedis.rpop(listName));
			}
	    	return list;
	    }
	    
	    public List<String> pop40(){
	    	List<String> list=new LinkedList<String>();
	    	/*while (jedis.llen(listName)!=0&&list.size()<40) {
				list.add(jedis.rpop(listName));
			}*/
	    	jedis.rpop(listName);
	    	return list;
	    }
	    
	   	   
	    public Long getDBSize(){
	    	return jedis.dbSize();
	    }

	    public void getAllElements(){
	    	List<String> list =jedis.lrange(listName, 0, -1);
	    	Iterator<String> it =list.iterator();
	    	while (it.hasNext()) {
				System.out.println((String)it.next());
			}
	    }
		public Jedis getJedis() {
			
			return jedis;
		}
}
