package com.unisk.ccq.arithmetic;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {60,32,33,5,34,67,213,8,1};
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[i]){
					temp=a[i];		
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"   ");
		}
	}
	
	

}
