/* Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
 * return its bottom-up level order traversal as:
 [
  [15,7],
  [9,20],
  [3]
 ]
 * 
 */

package lc.q0107.BinaryTreeLevelOrderTraversalII;
import java.util.*;

import lc.TreeNode;
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if (root == null)
            return res;
        
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        
        que.add(root);
        que.add(null);
        
        List<Integer> row = new ArrayList<Integer>();
        while(!que.isEmpty())
        {
        	TreeNode p = que.poll();
        	if (p==null)
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
        Collections.reverse(res);
        return res;
    }
}
