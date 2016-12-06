package com.unisk.ccq.nowcoder;
public class FibonacciList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fibonacci(3));
	}
	
	public static int Fibonacci(int n) {
        int preNum=1;
        int prePreNum=0;
        int result=0;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        for(int i=2;i<=n;i++){
            result=preNum+prePreNum;
            prePreNum=preNum;
            preNum=result;
        }
        return result;
 
    }

}
