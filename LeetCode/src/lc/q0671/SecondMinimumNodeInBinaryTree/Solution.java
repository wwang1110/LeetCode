/*
Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes.

Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.

If no such second minimum value exists, output -1 instead.

Example 1:
Input: 
    2
   / \
  2   5
     / \
    5   7

Output: 5
Explanation: The smallest value is 2, the second smallest value is 5.
Example 2:
Input: 
    2
   / \
  2   2

Output: -1
Explanation: The smallest value is 2, but there isn't any second smallest value.
 */
package lc.q0671.SecondMinimumNodeInBinaryTree;

import lc.TreeNode;

public class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null)
        	return -1;
        
        int left=-1;
        if(root.left==null)
        	left=-1;
        else if(root.left.val!=root.val)
        	left=root.left.val;
        else
        	left=findSecondMinimumValue(root.left);
        
        int right=-1;
        if(root.right==null)
        	right=-1;
        else if(root.right.val!=root.val)
        	right=root.right.val;
        else
        	right=findSecondMinimumValue(root.right);
        
        if((left==-1||left==root.val)&&(right==-1||right==root.val))
        	return -1;
        if(left==-1||left==root.val)
        	return right;
        if(right==-1||right==root.val)
        	return left;
        return Math.min(left, right);
    }
}
