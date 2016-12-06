package com.unisk.ccq.redis;

import java.util.List;

public interface RedisAsList {
	void push(String s);
	List<String> pop();

}
