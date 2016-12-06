package use;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLocalFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\test.txt");
		InputStreamReader isr=new InputStreamReader(fis);//字节流通向字符流的桥梁
		BufferedReader br = new BufferedReader(isr);
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println("数据为："+line);
		}
		br.close();
		isr.close();
		fis.close();
	}

}
