package com.unisk.ccq.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeFormatUtil {
	private static final Logger logger = LoggerFactory.getLogger(TimeFormatUtil.class);
	
	public static void main(String[] args) {
		//System.out.println(TimeStringToTimestamp("2016-04-22 11:11:11"));
		System.out.println(getNowTimeString());
		
	}
	public static String getNowTimeString(){
		Long time = System.currentTimeMillis();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String dateString = dateFormat.format(time);
		return String.valueOf(dateString);
	}
}
