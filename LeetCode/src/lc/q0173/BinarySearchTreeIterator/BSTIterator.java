/* Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 * 
 * Calling next() will return the next smallest number in the BST. 
 * 
 */

package lc.q0173.BinarySearchTreeIterator;

import java.util.Stack;

import lc.TreeNode;

public class BSTIterator {
	TreeNode cur = null;
	Stack<TreeNode> stack = new Stack<TreeNode>();
	
    public BSTIterator(TreeNode root) {
        cur = root;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
    	return cur != null || !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
    	int res = Integer.MIN_VALUE;
    	if (cur != null || !stack.isEmpty())
    	{
        	while(cur != null)
        	{
        		stack.push(cur);
        		cur = cur.left;
        	}
        	cur = stack.pop();
        	res = cur.val;
        	cur = cur.right;
        }
    	return res;
    }
}
