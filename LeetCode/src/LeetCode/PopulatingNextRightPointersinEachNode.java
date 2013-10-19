package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNode {
	//Given a binary tree

    //struct TreeLinkNode {
    //  TreeLinkNode *left;
    //  TreeLinkNode *right;
    //  TreeLinkNode *next;
    //}
	//Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

	//Initially, all next pointers are set to NULL.

	//Note:

	//You may only use constant extra space.
	//You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
	//For example,
	//Given the following perfect binary tree,
    //     1
    //   /  \
    //  2    3
    // / \  / \
    //4  5  6  7
	//After calling your function, the tree should look like:
    //     1 -> NULL
    //   /  \
    //  2 -> 3 -> NULL
    // / \  / \
    //4->5->6->7 -> NULL
    public void connect(TreeLinkNode root) {
    	if (root == null)
    		return;
    	
    	Queue<TreeLinkNode> que = new LinkedList<TreeLinkNode>();
    	que.offer(root);
    	que.offer(null);
    	
    	while (que.isEmpty() == false)
    	{
    		TreeLinkNode node = que.poll();
    		if (node == null && que.isEmpty() == false)
    			que.offer(null);
    		else if (node != null)
    		{
    			TreeLinkNode next = que.peek();
    			node.next = next;
    			if (node.left != null)
    				que.offer(node.left);
    			if (node.right != null)
    				que.offer(node.right);
    		}
    	}
    }
}
