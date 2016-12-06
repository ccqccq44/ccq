package com.unisk.ccq.arithmetic;
public class DichotomySearch {

	public static void main(String[] args) {
		int[] arr = new int[] { 12, 23, 34, 45, 56, 67, 77, 89, 90 ,91 };
		 System.out.println(search(arr, 56));
	}
	
	public static int search(int[] arr, int key) {
       int start = 0;
       int end = arr.length - 1;
       while (start <= end) {
           int middle = (start + end) / 2;
           if (key < arr[middle]) {
               end = middle - 1;
           } else if (key > arr[middle]) {
               start = middle + 1;
           } else {
               return middle;
           }
       }
       return -1;
	}

}
