package study;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
/*
 * 元字符：具有特殊含义的符号，
 * 常用元字符：
 *     .表示任意一个字符
 *     \s空格字符（空格键，tab，换行，换页，回车）
 *     \S非空格字符（[^\s]）
 *     \d代表一个数字（相当于[0-9]）
 *     \D代表一个非数字字符（相当于[^0-9]）
 *     \w一个单词字符（相当于[a-z A-Z 0-9]）
 *     \W一个非单词字符（[^\w]）
 *     ^一行的开始
 *     $一行的结尾
 *     \b一个单词的边界
 *     \B一个非单词的边界
 *     [abc]表示字符a,b,c中的任意一个（与a|b|c相同）  |代表或
 * 
 * 表示次数的元字符：
 *     *重复零次或更多次；例如a*匹配零个或者多个a
 *     +重复一次或更多次；例如a+匹配一个或者多个a
 *     ？重复零次或一次；例如a?匹配零个或者一个a
 *     {n}重复n次；例如a{4}匹配4个a
 *     {n,}重复n次或更多次；例如a{4,}至少4个a
 *     {n,m}重复n次到m次；例如a{4,10}匹配4~10个a
 * */
	public static void main(String[] args) {
		//匹配
		String s = "rrr234aadfa45747";
		System.out.println(s.matches(".*rrrr.*"));
		//替换r-v
		String rString=s.replaceAll("\\w", "v");
		System.out.println(rString);
		//萃取
		Pattern rPattern = Pattern.compile("\\d+");
		Matcher matcher = rPattern.matcher(s);
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		//分割
		String[] strings = s.split("\\d+");
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
	}

}
