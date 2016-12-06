package com.unisk.ccq.nowcoder;

import java.util.Stack;

public class TwoStackImplQueue {
	
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
     
    public void push(int node) {
    	stack1.push(new Integer(node));
    }
 
    public int pop() {
    	if(stack2.empty()){
	    	while(!stack1.empty()){
	    		stack2.push(stack1.pop());
			}
    	}
    	if(stack2.empty())
    	System.out.println("stack1 is empty!");	  
    	return stack2.pop().intValue();	 
	}

}
