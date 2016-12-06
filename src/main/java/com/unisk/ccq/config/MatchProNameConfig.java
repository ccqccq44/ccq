package com.unisk.ccq.config;

import java.io.File;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class MatchProNameConfig {
	
	public static String getProName(String userName){
		String proNameString="";
		SAXReader reader = new SAXReader();
		Document document = null;
		try {
			document = reader.read(MatchProNameConfig.class.getResource("/data/MatchProName.xml").getPath());
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		Element root = document.getRootElement();
		List<Element> childElements = root.elements();			
		for (Element child : childElements) {
			if(userName.equals(child.attributeValue("value"))){
				proNameString = child.elementText("proName");
			} 
		}
		return proNameString;				
	}
	
	
	public static void main(String[] args) throws DocumentException {
		System.out.println(getProName("bjadmin"));
	}

}
