package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNodeII {
	//Follow up for problem "Populating Next Right Pointers in Each Node".

	//What if the given tree could be any binary tree? Would your previous solution still work?

	//Note:

	//You may only use constant extra space.
	//For example,
	//Given the following binary tree,
	//         1
	//       /  \
	//      2    3
	//     / \    \
	//    4   5    7
	//After calling your function, the tree should look like:
	//         1 -> NULL
	//       /  \
	//      2 -> 3 -> NULL
	//     / \    \
	//    4-> 5 -> 7 -> NULL
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
