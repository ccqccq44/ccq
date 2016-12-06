package com.unisk.ccq.nowcoder;
public class JumpFloor {
	
	public static void main(String[] args) {
		System.out.println(jumpFloor(30));
	}
	
	public static int jumpFloor(int target){
	    if(target == 1 || target == 2) {
	    	return target;
	    }
	    int jumpSum = 0;// 当前台阶的跳法总数	 
	    int jumpSumBackStep1 = 2;// 当前台阶后退一阶的台阶的跳法总数(初始值当前台阶是第3阶)	 
	    int jumpSumBackStep2 = 1;// 当前台阶后退二阶的台阶的跳法总数(初始值当前台阶是第3阶)	 	 
	    for(int i = 3; i <= target; i++) {	 
		    jumpSum= jumpSumBackStep1 + jumpSumBackStep2;	 
		    jumpSumBackStep2 = jumpSumBackStep1;// 后退一阶在下一次迭代变为后退两阶	 
		    jumpSumBackStep1 = jumpSum;                   // 当前台阶在下一次迭代变为后退一阶	 
	    }
	    return jumpSum;    
	}	
}
