/* Given a binary tree, return the preorder traversal of its nodes' values.
 * 
 * For example:
 * Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
 * return [1,2,3].
 * 
 * Note: Recursive solution is trivial, could you do it iteratively?
 * 
 */
package lc.q0144.BinaryTreePreorderTraversal;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	
    	TreeNode cur = root;
    	
    	while(cur != null || !stack.isEmpty())
    	{
    		while(cur != null)
    		{
    			res.add(cur.val);
    			stack.push(cur);
    			cur = cur.left;
    		}
    		cur = stack.pop();
    		cur = cur.right;
    	}
    	
    	return res;
    }
}
