package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	//Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

	//For example:
	//Given binary tree {3,9,20,#,#,15,7},
	//    3
	//   / \
	//  9  20
	//    /  \
	//   15   7
	//return its level order traversal as:
	//[
	//  [3],
	//  [9,20],
	//  [15,7]
	//]
	//confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.


	//OJ's Binary Tree Serialization:
	//The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.

	//Here's an example:
	//   1
	//  / \
	// 2   3
	//    /
	//   4
	//    \
	//     5
	//The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".
    @SuppressWarnings("unchecked")
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (root == null)
        	return ret;
        Queue<TreeNode> que1 = new LinkedList<TreeNode>();
        Queue<TreeNode> que2 = new LinkedList<TreeNode>();
        que1.offer(root);
        int flag = 1;
        ArrayList<Integer> layer = new ArrayList<Integer>();
        while (que1.isEmpty() != true || que2.isEmpty() != true)
        {
        	if (flag == 1)
        	{
        		if (que1.isEmpty() != true)
        		{
        			TreeNode n = que1.poll();
        			layer.add(n.val);
        			if (n.left != null)
        				que2.offer(n.left);
        			if (n.right != null)
        				que2.offer(n.right);
        		}
        		else
        		{
        			ret.add((ArrayList<Integer>)layer.clone());
        			layer = new ArrayList<Integer>();
        			flag = 2;
        		}
        	}
        	else
        	{
        		if (que2.isEmpty() != true)
        		{
        			TreeNode n = que2.poll();
        			layer.add(n.val);
        			if (n.left != null)
        				que1.offer(n.left);
        			if (n.right != null)
        				que1.offer(n.right);
        		}
        		else
        		{
        			ret.add((ArrayList<Integer>)layer.clone());
        			layer = new ArrayList<Integer>();
        			flag = 1;
        		}
        	}
        }
        if (layer.isEmpty()==false)
        	ret.add(layer);
        return ret;
    }
}
