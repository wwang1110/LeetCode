/* Given a binary tree, find the leftmost value in the last row of the tree.
 * Example 1:
 * Input:

    2
   / \
  1   3

 * Output:
 * 1
 * 
 * Example 2:
 * Input:

        1
       / \
      2   3
     /   / \
    4   5   6
       /
      7

 * Output:
 * 7
 * Note: You may assume the tree (i.e., the given root node) is not NULL.
 * 
 */
package lc.q0513.FindBottomLeftTreeValue;

import lc.TreeNode;

public class Solution {
	int level;
	int num;
    public int findBottomLeftValue(TreeNode root) {
        level=0;
        num=0;
        searchBottomLeftValue(root, 1);
        return num;
    }
	private void searchBottomLeftValue(TreeNode node, int curlevel) {
		if(node==null)
			return;
		if(node.left==null&&node.right==null&&curlevel>level)
		{
			level=curlevel;
			num=node.val;
		}
		if(node.left!=null)
			searchBottomLeftValue(node.left, curlevel+1);
		if(node.right!=null)
			searchBottomLeftValue(node.right, curlevel+1);
	}
}
