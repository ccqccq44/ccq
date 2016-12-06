package com.unisk.ccq.arithmetic;
import java.util.*;

import com.unisk.ccq.arithmetic.BinaryTree.TreeNode;
public class Copy_2_of_BinaryTreeLayer {

	
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	
	    public TreeNode(int val) {
	        this.val = val;
	    }
	    public TreeNode(int val, TreeNode left, TreeNode right) {  
            this.val = val;  
            this.left = left;  
            this.right = right;  
        }  
	}
	
	public TreeNode init() {
		TreeNode D = new TreeNode(4, null, null);
		TreeNode H = new TreeNode(8, null, null);  
        TreeNode I = new TreeNode(9, null, null);  
        TreeNode J = new TreeNode(10, null, null);  
        TreeNode P = new TreeNode(11, null, null);  
        TreeNode G = new TreeNode(7, P, null);  
        TreeNode F = new TreeNode(6, null, J);  
        TreeNode E = new TreeNode(5, H, I);  
        TreeNode B = new TreeNode(2, D, E);  
        TreeNode C = new TreeNode(3, F, G);  
        TreeNode A = new TreeNode(1, B, C);  
        return A;  
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
            System.out.println(al);
        }
        return al;
    }
    public static void main(String[] args) {
    	Copy_2_of_BinaryTreeLayer a = new Copy_2_of_BinaryTreeLayer();
    	TreeNode root =a.init();
    	System.out.println(a.PrintFromTopToBottom(root));
	}
	
}