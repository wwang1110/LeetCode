/* You need to find the largest value in each row of a binary tree.
 * Example:
 * Input: 

          1
         / \
        3   2
       / \   \  
      5   3   9 

 * Output: [1, 3, 9]
 * 
 */

package lc.q0515.FindLargestValueinEachTreeRow;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public List<Integer> largestValues(TreeNode root) {
    	List<Integer> list=new ArrayList<Integer>();
    	if(root==null)
    		return list;
    	Queue<TreeNode> que=new LinkedList<TreeNode>();
    	que.add(root);
    	que.add(null);
    	int levelmax=Integer.MIN_VALUE;
    	while(!que.isEmpty())
    	{
    		TreeNode node=que.poll();
    		if(node!=null)
    		{
    			levelmax=Math.max(levelmax, node.val);
    			if(node.left!=null)
    				que.add(node.left);
    			if(node.right!=null)
    				que.add(node.right);
    		}
    		else
    		{
    			que.add(node);
    			list.add(levelmax);
    			levelmax=Integer.MIN_VALUE;
                if(que.size()==1)
                    break;
    		}
    	}
    	return list;
    }
}
