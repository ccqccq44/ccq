package ccq;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
        String a;
        String b;
        while(cin.hasNext())
        {
            a = cin.next();
            b = cin.next();
            System.out.println(isAnagram(a, b));
        }
	}
	public static boolean isAnagram(String s, String t) {
        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();
        List<String> list1=new LinkedList<String>();
        List<String> list2=new LinkedList<String>();
        for(int i=0;i<array1.length;i++){
        	list1.add(String.valueOf(array1[i]));
        }
        for(int i=0;i<array2.length;i++){
        	list2.add(String.valueOf(array2[i]));        	
        }
        if(list1.containsAll(list2)&&list2.containsAll(list1)){
        	return true;
        }
        return false;          
    }


}
