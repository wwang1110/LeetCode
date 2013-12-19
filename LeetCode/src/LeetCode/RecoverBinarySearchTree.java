package LeetCode;

import java.util.ArrayList;

public class RecoverBinarySearchTree {
	//Two elements of a binary search tree (BST) are swapped by mistake.

	//Recover the tree without changing its structure.

	//Note:
	//A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?
	//confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
    public void recoverTree(TreeNode root) {
    	ArrayList<TreeNode> nodes = new ArrayList<TreeNode>();
    	inorder(nodes, root);
    	
    	TreeNode left = null;
    	TreeNode right = null;
    	for (int i = 0; i < nodes.size() - 1; i++)
    		if (nodes.get(i).val > nodes.get(i + 1).val && left == null)
			{
    			left = nodes.get(i);
    			break;
			}

    	for (int i = nodes.size() - 1; i > 0; i--)
    		if (nodes.get(i).val < nodes.get(i - 1).val && right == null)
			{
    			right = nodes.get(i);
    			break;
			}
    	int tmp = left.val;
    	left.val = right.val;
    	right.val = tmp;
    }

	private void inorder(ArrayList<TreeNode> nodes, TreeNode node) {
		if (node != null)
		{
			inorder(nodes, node.left);
			nodes.add(node);
			inorder(nodes, node.right);
		}
	}
}
