/*
Given a binary tree, write a function to get the maximum width of the given tree. The width of a tree is the maximum width among all levels. The binary tree has the same structure as a full binary tree, but some nodes are null.

The width of one level is defined as the length between the end-nodes (the leftmost and right most non-null nodes in the level, where the null nodes between the end-nodes are also counted into the length calculation.

Example 1:
Input: 

           1
         /   \
        3     2
       / \     \  
      5   3     9 

Output: 4
Explanation: The maximum width existing in the third level with the length 4 (5,3,null,9).
Example 2:
Input: 

          1
         /  
        3    
       / \       
      5   3     

Output: 2
Explanation: The maximum width existing in the third level with the length 2 (5,3).
Example 3:
Input: 

          1
         / \
        3   2 
       /        
      5      

Output: 2
Explanation: The maximum width existing in the second level with the length 2 (3,2).
Example 4:
Input: 

          1
         / \
        3   2
       /     \  
      5       9 
     /         \
    6           7
Output: 8
Explanation:The maximum width existing in the fourth level with the length 8 (6,null,null,null,null,null,null,7).


Note: Answer will in the range of 32-bit signed integer.
*/
package lc.q0662.MaximumWidthofBinaryTree;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<TreeNode>();
        Queue<Integer> idxque=new LinkedList<Integer>();
        
        if(root==null)
        	return 0;
        
        que.add(root);
        idxque.add(1);
        que.add(null);
        int maxWidth=1;
        int mostleft=0;
        while(!que.isEmpty())
        {
        	TreeNode node=que.poll();
        	if(node!=null)
        	{
        		int idx=idxque.poll();
        		if(mostleft==0)
        			mostleft=idx;
        		maxWidth=Math.max(maxWidth, idx-mostleft+1);
        		if(node.left!=null)
        		{
        			que.add(node.left);
        			idxque.add(idx*2);
        		}
        		if(node.right!=null)
        		{
        			que.add(node.right);
        			idxque.add(idx*2+1);
        		}
        	}
        	else
        	{
        		if(que.isEmpty())
        			break;
        		else
        			que.add(null);
        		mostleft=0;
        	}
        }
        return maxWidth;
    }
}
