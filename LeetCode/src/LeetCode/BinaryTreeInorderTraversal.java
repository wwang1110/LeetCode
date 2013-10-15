package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	//Given a binary tree, return the inorder traversal of its nodes' values.

	//For example:
	//Given binary tree {1,#,2,3},
	//	  1
	//	   \
	//	    2
	//	   /
	//   3
	//return [1,3,2].

	//Note: Recursive solution is trivial, could you do it iteratively?

	//confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.


	//OJ's Binary Tree Serialization:
	//The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.

	//Here's an example:
	//	  1
	//	 / \
	//	2   3
	//	   /
	//	  4
	//	   \
	//	    5
	//The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
    	ArrayList<Integer> ret = new ArrayList<Integer>();
    	
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	stack.push(new TreeNode(-1));
    	TreeNode node = root;
    	while (!stack.isEmpty())
    	{
	    	while (node != null)
	    	{
	    		stack.push(node);
	    		node = node.left;
	    	}
	    	node = stack.pop();
	    	ret.add(node.val);
	    	node = node.right;
    	}
    	ret.remove(ret.size() - 1);
    	return ret;
    }	
}
