package com.unisk.ccq.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class GetJedis {
	private static final Logger logger = LoggerFactory.getLogger(GetJedis.class);
	
	private JedisPool jedisPool;
	
	public JedisPool getJedisPool() {
		return jedisPool;
	}
	private   GetJedis(){
		 JedisPoolConfig jedisPoolConfig = new JedisPoolConfig(); 
	     jedisPool = new JedisPool(jedisPoolConfig,"127.0.0.1",6379);
	}
	private static final GetJedis getJedis= new GetJedis();
	public static GetJedis getInstance(){
		return getJedis;
	}

}
