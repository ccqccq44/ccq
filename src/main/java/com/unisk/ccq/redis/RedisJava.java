package com.unisk.ccq.redis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class RedisJava {
	//jedis.ping()为PONG说明已经连接上redis服务了
   /*public static void main(String[] args) {
      //连接本地的 Redis 服务
      Jedis jedis = new Jedis("localhost");
      System.out.println("Connection to server sucessfully");
      //查看服务是否运行
      System.out.println("Server is running: "+jedis.ping());
   }*/
	public static void main(String[] args) {
	      //连接本地的 Redis 服务
	      Jedis jedis = new Jedis("localhost");
	      
	      //设置 redis 字符串数据
	      //jedis.set("ccq", "Redis");
	      
	      //设置 redis hashmap数据
	      /*Map<String, String> map = new HashMap<String, String>();
	      map.put("移动", "牛逼");
	      map.put("联通", "也牛逼");
	      jedis.hmset("ccq1", map);
	      System.out.println(String.format("len:%d", jedis.hlen("ccq1")));//mapkey个数
	      System.out.println(String.format("keys: %s", jedis.hkeys("ccq1") )); //map中的所有键值
	      System.out.println(String.format("values: %s", jedis.hvals("ccq1") )); //map中的所有value
	      List<String> rsmap = jedis.hmget("ccq1", "移动","联通");//取出map中的name字段值
	      System.out.println(rsmap);
	      jedis.hdel("ccq1", "联通");//删除map中的某一个键值 password
	      System.out.println(jedis.hmget("ccq1", "移动", "联通"));*/
	      
	      //设置redis list数据
	      /*jedis.lpush("ccq2", "Redis");
	      jedis.lpush("ccq2", "Mongodb");
	      jedis.lpush("ccq2", "Mysql"); //lpush将值插入列表头部，
	      List<String> list = jedis.lrange("ccq2", 0 ,2); //获取下标为0,1,2的三个元素
	      System.out.println(jedis.lpop("ccq2")); //移除并获取   list第一个String元素
	      System.out.println(jedis.rpop("ccq2")); //移除并获取   list最后一个String元素
	      for(int i=0; i<list.size(); i++) {
	        System.out.println("Stored string in redis:: "+list.get(i));
	      }*/
	      
	      //设置redis set数据
          /*jedis.sadd("jedisSet", "1 2 3 4 5 5".split(" ")); 
	      jedis.sadd("jedisSet1", "1");
	      jedis.sadd("jedisSet1", "2");
          Set<String> s = jedis.smembers("jedisSet"); // 返回集合中的所有元素  
          System.out.println("sadd 返回值："+s);//返回值：[1, 2, 3, 4, 5]  */
	      
	      //设置redis sortedset数据
	   
	      Long zadd = jedis.zadd("jedisSortSet", 5.0, "apple");  
	      System.out.println("zadd fruit apple=" + zadd);  
	      zadd = jedis.zadd("jedisSortSet", 6.0, "apple");  // 重复添加, 会修改权重  
	      System.out.println("zadd fruit apple again=" + zadd);
	      jedis.zadd("jedisSortSet", 2.0, "banana");  
	      jedis.zadd("jedisSortSet", 4.0, "orange");  
	      jedis.zadd("jedisSortSet", 8.0, "grape");  
	      jedis.zadd("jedisSortSet", 10.0, "lemon");  
	      jedis.zadd("jedisSortSet", 7.0, "cherry");  
	      System.out.println("zcard fruit=" + jedis.zcard("jedisSortSet"));// 统计元素个数
	      System.out.println("zcount fruit [1.0,5.0]=" + jedis.zcount("jedisSortSet", 1.0, 5.0)); // 统计某个权重范围内元素个数 
	      System.out.println("zrank fruit grape=" + jedis.zrank("jedisSortSet", "grape"));  
	      System.out.println("zrevrank fruit grape=" + jedis.zrevrank("jedisSortSet", "grape"));  
	 }
}
