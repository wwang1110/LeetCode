/* Given a binary tree, return the inorder traversal of its nodes' values.
 * For example:
 * Given binary tree [1,null,2,3],
 *    1
 *     \
 *      2
 *     /
 *    3
 * return [1,3,2].
 * 
 * Note: Recursive solution is trivial, could you do it iteratively?
 * 
 */
package lc.q0094.BinaryTreeInorderTraversal;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<Integer>();
    	
    	if(root == null)
    		return res;
    	
        Stack<TreeNode> stack = new Stack<TreeNode>();
    	TreeNode p = root;
        while(p != null || !stack.isEmpty())
        {
        	while(p != null)
        	{
        		stack.push(p);
        		p = p.left;
        	}
        	p = stack.pop();
        	res.add(p.val);
        	p = p.right;
        }
        
        return res;
    }
}

