package com.unisk.ccq.arithmetic;

public class SelectSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {6,3,33,5,34,67,213,8,1};
		int keyvalue;
		int index;
		int temp;
		for(int i=0;i<a.length;i++){
			index=i;	//index=0
			keyvalue=a[i];	//keyvalue=6
			for(int j=i+1;j<a.length;j++){
				if(a[j]<keyvalue){
					index=j;		
					keyvalue=a[j];					
				}
			}
			temp = a[i];   
			a[i]=a[index];
			a[index]=temp;
		}
		for(int b:a){
			System.out.print(b+" ");
		}
	}
}
