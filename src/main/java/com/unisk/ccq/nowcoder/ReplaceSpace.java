package com.unisk.ccq.nowcoder;
public class ReplaceSpace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sBuffer = new StringBuffer("We Are Happy");
		System.out.println(replaceSpace(sBuffer));
	}
	
	/*public static String replaceSpace(StringBuffer aString){
		return aString.toString().replaceAll("\\s", "%20");
	}*/
	public static String replaceSpace(StringBuffer str){
		String bString = str.toString();
		char[] array = bString.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<array.length;i++){
			if(array[i]==' '){
				sb.append("%20");
			}else{
				sb.append(array[i]);
			}
		}
		return sb.toString();
	}

}
