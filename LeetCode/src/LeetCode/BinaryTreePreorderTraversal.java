package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
	//Given a binary tree, return the preorder traversal of its nodes' values.

	//For example:
	//Given binary tree {1,#,2,3},
	//		   1
	//		    \
	//		     2
	//		    /
	//		   3
	//		return [1,2,3].

	//Note: Recursive solution is trivial, could you do it iteratively?
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        if (root == null)
        	return ret;
        
        TreeNode node = root;
        ret.add(node.val);
        s.push(node);
        while (!s.isEmpty())
        {
        	if (node.left != null)
        	{
        		node = node.left;
        		ret.add(node.val);
        		s.push(node);
        	}
        	else
        	{
            	node = s.pop();
            	if (node.right != null)
            	{
            		node = node.right;
            		ret.add(node.val);
            		s.push(node);
            	}
        	}
        }
        
        return ret;
    }

}
