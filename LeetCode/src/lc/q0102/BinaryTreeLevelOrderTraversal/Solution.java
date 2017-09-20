/* Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */

package lc.q0102.BinaryTreeLevelOrderTraversal;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	
    	if (root == null)
    		return res;
    	
    	Queue<TreeNode> que = new LinkedList<TreeNode>();
    	que.add(root);
    	que.add(null);
    	
    	TreeNode p;
		List<Integer> row = new ArrayList<Integer>();
    	while (!que.isEmpty())
    	{
    		p = que.poll();
    		if (p == null)
    		{
				res.add(new ArrayList<Integer>(row));
    			if (que.isEmpty())
    				break;
    			else
    			{
    				que.add(p);
    				row.clear();
    			}
    		}
    		else
    		{
    			row.add(p.val);
    			if (p.left != null)
    				que.add(p.left);
    			if (p.right != null)
    				que.add(p.right);
    		}
    	}
    	return res;
    }
}
