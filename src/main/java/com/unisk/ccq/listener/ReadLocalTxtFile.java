package com.unisk.ccq.listener;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import com.unisk.ccq.redis.RedisAsPhoneList;


public class ReadLocalTxtFile implements ServletContextListener {

	//public static void readTxtFile(String filePath) {
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}
	public void contextInitialized(ServletContextEvent arg0) {
		RedisAsPhoneList redisAsPhoneList = RedisAsPhoneList.getInstance();
		try {
            String encoding="UTF-8";
            File file=new File("E:\\test.txt");
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while((lineTxt = bufferedReader.readLine()) != null){
                    System.out.println(lineTxt);
                    redisAsPhoneList.push(lineTxt);
                }
                read.close();
		    }else{
		        System.out.println("找不到指定的文件");
		    }
		} catch (Exception e) {
	        System.out.println("读取文件内容出错");
	        e.printStackTrace();
		}
	}
	/*public static void main(String[] args) {
		String filePath = "E:\\test.txt";
		readTxtFile(filePath);
	}*/

}
