/*
Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.

Example 1:
Input:
    3
   / \
  9  20
    /  \
   15   7
Output: [3, 14.5, 11]
Explanation:
The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
Note:
The range of node's value is in the range of 32-bit signed integer.
 * 
 */
package lc.q0637.AverageofLevelsinBinaryTree;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
    	List<Double> ret=new ArrayList<Double>();
        if(root==null)
        	return ret;
        Queue<TreeNode> que=new LinkedList<TreeNode>();
        que.add(root);
        que.add(null);
        int count=0;
        double sum=0;
        while(!que.isEmpty())
        {
        	TreeNode node=que.poll();
        	if(node==null)
        	{
        		ret.add(sum/count);
        		if(que.isEmpty())
        			return ret;
        		sum=0;
        		count=0;
        		que.add(node);
        	}
        	else
        	{
        		sum+=node.val;
        		count++;
        		if(node.left!=null)
        			que.add(node.left);
        		if(node.right!=null)
        			que.add(node.right);
        	}
        }
        return ret;
    }
}
