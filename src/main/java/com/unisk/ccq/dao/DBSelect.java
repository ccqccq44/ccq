package com.unisk.ccq.dao;

import java.io.Console;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBSelect {	
	private static final Logger logger = LoggerFactory.getLogger(DBSelect.class);
	
	public static void main(String[] args) {		
		selectSMSlog("ccqcccccc");
	}
	public static void selectSMSlog(String phone){ 
		String resource = "com/unisk/ccq/map/MyBatisConfig.xml";
		Reader reader = null;
		SqlSession session;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			logger.error("",e);
		}
		SqlSessionFactory sqlMapper = SQLSessionFactory.getSessionFactory()
				.build(reader);
		session = sqlMapper.openSession();  //默认不提交
		try{
			session.insert("insertTest",phone);
			logger.info("第一个成功");
			session.insert("insertTest1",phone);
			logger.info("第二个");
			//session.commit();
		}
		catch(Exception e)
		{
			logger.error("",e);
			//session.rollback();
		}
		finally
		{
			session.close();
		}
	}

}
