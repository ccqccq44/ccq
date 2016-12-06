package use;

import javax.swing.text.ChangedCharSetException;

import com.google.gson.Gson;

public class ReverseWordInString {

	public static void main(String[] args) {
		String str = "we   are   the champions";
		str = str.replaceAll("\\s{1,}", " ");//将多个空格转化为单个空格
		String[] arr=str.split(" ");
		String resultString = "";
		for (int i = 0; i < arr.length; i++) {
			resultString+= swap(arr[i])+" ";
		}
		System.out.println(resultString);
		//System.out.println(new Gson().toJson(arr));

	}
	public static String swap(String str){
		char[] arr = str.toCharArray();
		String resultString="";
		for (int i = 0; i < arr.length; i++) {
			resultString+=String.valueOf(arr[arr.length-1-i]);
		}
		return resultString;
	}
	
	
	/*public static void main(String[] args) {
		String str = "we are the champions";
		String[] arr=str.split(" ");
		String resultString = "";
		for (int i = 0; i < arr.length; i++) {
			resultString+= swap(arr[i])+" ";
		}
		System.out.println(resultString);
		//System.out.println(new Gson().toJson(arr));

	}
	public static String swap(String str){
		char[] arr = str.toCharArray();
		String resultString="";
		for (int i = 0; i < arr.length; i++) {
			resultString+=String.valueOf(arr[arr.length-1-i]);
		}
		return resultString;
	}*/

}
