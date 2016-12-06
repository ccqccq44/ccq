package com.unisk.ccq.arithmetic;

public class InsertSort {	
	public static void main(String[] args) { 
	    int a[]={-1, 3, -8, 0, 2, 1 };
	    insertSort(a);
	}
	public static void insertSort(int[] a){
		int j;               //当前值的位置  
        int i;               //指向j前的位置  
        int key;             //当前要进行插入排序的值  
        //从数组的第二个位置开始遍历值  
        for(j=1;j<a.length;j++){  
            key=a[j];  
            i=j-1;                
            while(i>=0 && a[i]>key){  //a[i]比当前值大时，a[i]后移一位,空出i的位置，好让下一次循环的值后移
                a[i+1]=a[i]; //将a[i]值后移  
                i--;         //i前移  
            }//跳出循环(找到要插入的中间位置或已遍历到0下标)  
            a[i+1]=key;    //将当前值插入  
        }  
	    for(int ccq=0;ccq<a.length;ccq++)  	  
	       System.out.print(a[ccq]+" "); 		
	}
}
