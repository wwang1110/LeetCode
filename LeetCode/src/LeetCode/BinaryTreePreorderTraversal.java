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
        s.push(new TreeNode(-1));
        while (!s.isEmpty())
        {
        	if (node != null)
        	{
        		ret.add(node.val);
        		s.push(node);
        		node = node.left;
        	}
        	else
        	{
            	node = s.pop();
        		node = node.right;
        	}
        }
        
        return ret;
    }
}
