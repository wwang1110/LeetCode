/* Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
 * 
 * Basically, the deletion can be divided into two stages:
 * 
 * Search for a node to remove.
 * If the node is found, delete the node.
 * Note: Time complexity should be O(height of tree).
 * 
 * Example:
 *
 * root = [5,3,6,2,4,null,7]
 * key = 3

    5
   / \
  3   6
 / \   \
2   4   7

 * Given key to delete is 3. So we find the node with value 3 and delete it.

 * One valid answer is [5,4,6,2,null,null,7], shown in the following BST.

    5
   / \
  4   6
 /     \
2       7

 * Another valid answer is [5,2,6,null,4,null,7].

    5
   / \
  2   6
   \   \
    4   7 
 * 
 */

package lc.q0450.DeleteNodeinBST;

import lc.TreeNode;

public class Solution {
    public TreeNode deleteNode(TreeNode node, int key) {
    	if (node==null)
    		return null;
		if(node.left!=null&&key<node.val)
			node.left=deleteNode(node.left, key);
		else if(node.right!=null&&key>node.val)
			node.right=deleteNode(node.right, key);
		else if (key==node.val)
		{
			if(node.right==null)
				node=node.left;
			else
			{
				TreeNode p=node.right;
				while(p.left!=null)
					p=p.left;
				node.val=p.val;
				node.right=deleteNode(node.right, p.val);
			}
		}
		return node;
    }
}
