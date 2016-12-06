package com.unisk.ccq.arithmetic;

/* 
 * @Author:Richardwe 
 * @description:快速排序法 
 */  
public class QuickSort {  
  
    public static void main(String[] args) {  
        int a[] = {57, 68, 59, 52, 72, 28, 96, 33, 24, 19};      
        quickSort(a, 0, a.length - 1);  
        for (int i = 0; i < a.length; i++) {  
            System.out.print(a[i]+"   ");  
        }    
    }  
  
    //取第一位与最后一位为判断基准点 a , 0 ,8  
    public static void quickSort(int[] list, int low, int high) {   
        if (low < high) {    
            int middle = getMiddle(list, low, high); // 将list数组进行一分为二    
            quickSort(list, low, middle - 1); // 对低字表进行递归排序    
            quickSort(list, middle + 1, high); // 对高字表进行递归排序    
        }    
    }  
  
    public static int getMiddle(int[] list, int low, int high) { //list={57, 68, 59, 52, 72, 28, 96, 33, 24, 19}   
        int temp = list[low];	//temp=57    
        while (low < high) {    
            while (low < high && list[high] >= temp) {    
                high--;    
            }    
            list[low] = list[high]; // 比中轴小的记录移到低端    
            while (low < high && list[low] <= temp) {    
                low++;    
            }    
            list[high] = list[low]; // 比中轴大的记录移到高端   
            //list={57, 68, 59, 52, 72, 28, 96, 33, 24, 19}
            //list={19, 68, 59, 52, 72, 28, 96, 33, 24, 68}
            //list={19, 24, 59, 52, 72, 28, 96, 33, 59, 68}
            //list={19, 24, 33, 52, 72, 28, 96, 72, 59, 68}
            //list={19, 24, 33, 52, 28, 28, 96, 72, 59, 68}
        }    
        list[low] = temp; // 中轴记录到尾  
      //list={19, 24, 33, 52, 28, 57, 96, 72, 59, 68}
        return low;   
    }  
} 