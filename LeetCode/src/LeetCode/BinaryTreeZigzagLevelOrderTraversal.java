package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeZigzagLevelOrderTraversal {
	//Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

	//For example:
	//Given binary tree {3,9,20,#,#,15,7},
	//    3
	//   / \
	//  9  20
	//    /  \
	//   15   7
	//return its zigzag level order traversal as:
	//[
	//  [3],
	//  [20,9],
	//  [15,7]
	//]
	//confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.


	//OJ's Binary Tree Serialization:
	//The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.

	//Here's an example:
	//   1
	//  / \
	// 2   3
	//    /
	//   4
	//    \
	//     5
	//The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".
    @SuppressWarnings("unchecked")
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
    	if (root == null)
    		return ret;
    	
        Stack<TreeNode> stack1 = new Stack<TreeNode>(); 
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        stack1.push(root);
        int flag = 1;
        ArrayList<Integer> layer = new ArrayList<Integer>();
        
        while (stack1.isEmpty() != true || stack2.isEmpty() != true)
        {
        	if (flag == 1)
        	{
        		if (stack1.isEmpty() != true)
        		{
        			TreeNode n = stack1.pop();
        			layer.add(n.val);
        			if (n.left != null)
        				stack2.push(n.left);
        			if (n.right != null)
        				stack2.push(n.right);
        		}
        		else
        		{
        			ret.add((ArrayList<Integer>)layer.clone());
        			layer = new ArrayList<Integer>();
        			flag = 2;
        		}
        	}
        	else
        	{
        		if (stack2.isEmpty() != true)
        		{
        			TreeNode n = stack2.pop();
        			layer.add(n.val);
        			if (n.left != null)
        				stack1.push(n.left);
        			if (n.right != null)
        				stack1.push(n.right);
        		}
        		else
        		{
        			ret.add((ArrayList<Integer>)layer.clone());
        			layer = new ArrayList<Integer>();
        			flag = 1;
        		}
        	}
        }
        if (layer.isEmpty() != true)
        	ret.add(layer);
        
        return ret;
    }	
}
