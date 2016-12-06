package com.unisk.ccq.nowcoder;
public class MinNumberInRotateArray {
	
	public static void main(String[] args) {
		int[] array = {3,4,5,1,2};
		System.out.println(minNumberInRotateArray(array));
	}
	public static int minNumberInRotateArray(int [] array) {
        int low = 0 ; int high = array.length - 1;   
        while(low < high){		//low=0 high=4
            int mid = low + (high - low) / 2;    //mid=2    
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }   
        }
        return array[low];
    
    }

}
