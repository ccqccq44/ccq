package com.unisk.ccq.arithmetic;

import java.util.LinkedList;
import java.util.List;

public class RemoveListDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		removeDuplicate(list);
			
	}
	public   static   void  removeDuplicate(List<Integer> list)   { 
	    for(int i = 0; i < list.size()-1; i++ ){ 
		   for(int j = list.size()-1; j > i; j--){ 
			   if  (list.get(j).equals(list.get(i)))   { 
				   list.remove(j); 
			   } 
		   } 
	    } 
		System.out.println(list); 
	} 

}
