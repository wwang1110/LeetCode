/* One way to serialize a binary tree is to use pre-order traversal. When we encounter a non-null node, we record the node's value. If it is a null node, we record using a sentinel value such as #.

     _9_
    /   \
   3     2
  / \   / \
 4   1  #  6
/ \ / \   / \
# # # #   # #
 * For example, the above binary tree can be serialized to the string "9,3,4,#,#,1,#,#,2,#,6,#,#", where # represents a null node.
 * 
 * Given a string of comma separated values, verify whether it is a correct preorder traversal serialization of a binary tree. Find an algorithm without reconstructing the tree.
 * 
 * Each comma separated value in the string must be either an integer or a character '#' representing null pointer.
 * 
 * You may assume that the input format is always valid, for example it could never contain two consecutive commas such as "1,,3".
 * 
 * Example 1:
 * "9,3,4,#,#,1,#,#,2,#,6,#,#"
 * Return true
 * 
 * Example 2:
 * "1,#"
 * Return false
 * 
 * Example 3:
 * "9,#,#,1"
 * Return false
 * 
 */

package lc.q0331.VerifyPreorderSerializationofBinaryTree;

import lc.TreeNode;

public class Solution {
	private String[] values;
	private int idx;
	private TreeNode root;
    public boolean isValidSerialization(String preorder) {
    	if (preorder.equals("#"))
    		return true;
    	if (preorder.startsWith("#"))
    		return false;
        values= preorder.split(",");
        root = new TreeNode(Integer.parseInt(values[0]));
        idx = 1;
        return isValidSerialization(root) && idx == values.length;
    }

	private boolean isValidSerialization(TreeNode node) {
		if (idx > values.length - 2)
			return false;
		
		boolean left = true;
		if (!values[idx].equals("#"))
		{
			node.left = new TreeNode(Integer.parseInt(values[idx]));
			idx++;
			left = isValidSerialization(node.left);
		}
		else
			idx++;
		if (left == false)
			return false;
		
		boolean right = true;
		if (!values[idx].equals("#"))
		{
			node.right = new TreeNode(Integer.parseInt(values[idx]));
			idx++;
			right = isValidSerialization(node.right);
		}
		else
			idx++;
		return right;
	}
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	s.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#");
    }	
}
