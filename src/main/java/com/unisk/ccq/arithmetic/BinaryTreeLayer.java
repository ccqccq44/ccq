package com.unisk.ccq.arithmetic;
import java.util.*;

import com.unisk.ccq.arithmetic.BinaryTree.TreeNode;
public class BinaryTreeLayer {	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;	
	    public TreeNode(int val) {
	        this.val = val;
	    }	
	}

	//通过队列实现二叉树的层次遍历	
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        if(root==null) return al;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        //将根节点放入队列中
        queue.offer(root);
        while(!queue.isEmpty()){
        	TreeNode treeNode=queue.poll();
            if(treeNode.left!=null){
                queue.offer(treeNode.left);
            }
            if(treeNode.right!=null){
                queue.offer(treeNode.right);
            }
            al.add(treeNode.val);            
        }
        return al;
    }
	
}