/* Given a binary tree, return all root-to-leaf paths.
 * 
 * For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
 * All root-to-leaf paths are:
 * ["1->2->5", "1->3"]
 * 
 */

package lc.q0257.BinaryTreePaths;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        generatePath(root, "", res);
        return res;
    }

	private void generatePath(TreeNode root, String path, List<String> res) {
		if (root == null)
			return;
		String str = path + "->" + root.val; 
		if (root.left == null && root.right == null)
		{
			res.add(str.substring(2));
			return;
		}
		
		if (root.left != null)
			generatePath(root.left, str, res);
		
		if (root.right != null)
			generatePath(root.right, str, res);
	}
}
