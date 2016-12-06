package com.unisk.ccq.dao;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SQLSessionFactory {
	
	private static final SqlSessionFactoryBuilder sqlMapper = new SqlSessionFactoryBuilder();
	
	public static SqlSessionFactoryBuilder getSessionFactory(){
		return sqlMapper;
	}

}
