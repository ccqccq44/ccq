package com.unisk.ccq.nowcoder;

public class TwoDimensionalArrayQuery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int target = 10;
		System.out.println(Find(array,target));
	}
	
	public static boolean Find(int [][] array,int target) {
		int len = array.length-1;	//len=3
        int i = 0;					
        while((len >= 0)&& (i < array[len].length)){
            if(array[len][i] > target){   //array[2][1]=9>10
                len--;					  //len=2
            }else if(array[len][i] < target){ //array[2][0]=9<10
                i++;						//i=2
            }else{
                return true;
            }
        }
        return false;
    	}
}
