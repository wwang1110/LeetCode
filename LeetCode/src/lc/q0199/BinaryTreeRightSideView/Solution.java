/* Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 * 
 * For example:
 * Given the following binary tree,
   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
 * You should return [1, 3, 4].
 * 
 */

package lc.q0199.BinaryTreeRightSideView;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
    	
    	List<Integer> res = new ArrayList<Integer>();
    	if (root == null)
    		return res;
    	
    	Queue<TreeNode> que = new LinkedList<TreeNode>();
    	
    	que.add(root);
    	que.add(null);
    	TreeNode last = root;
    	
        TreeNode p = null;
    	while (!que.isEmpty())
    	{
    		p = que.poll();
    		if (p == null)
    		{
    			res.add(last.val);
    			if (que.isEmpty())
    				break;
    			else
        			que.add(p);
    		}
    		else
    		{
    			if (p.left != null)
    				que.add(p.left);
    			if (p.right != null)
    				que.add(p.right);
    		}
    		last = p;
    	}
    	
    	return res;
    }
}
