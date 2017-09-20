/* Given a binary tree, determine if it is a valid binary search tree (BST).
 * 
 * Assume a BST is defined as follows:
 * 
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * 
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * 
 * Both the left and right subtrees must also be binary search trees.
 * 
 */

package lc.q0098.ValidateBinarySearchTree;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        TreeNode p = root;
        
        while (p != null || !stack.isEmpty())
        {
        	while (p != null)
        	{
        		stack.push(p);
        		p = p.left;
        	}
        	p = stack.pop();
        	inorder.add(p.val);
        	p = p.right;
        }
        
        for (int i = 1; i < inorder.size(); i ++)
        	if (inorder.get(i) <= inorder.get(i-1))
        		return false;
        return true;
    }
}
