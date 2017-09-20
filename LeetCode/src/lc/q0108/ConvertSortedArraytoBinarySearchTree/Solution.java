// Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

package lc.q0108.ConvertSortedArraytoBinarySearchTree;

import lc.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
       return  generateBST(0, nums.length-1, nums);
    }

	private TreeNode generateBST(int i, int j, int[] nums) {
		if (i > j)
			return null;
		if (i == j)
			return new TreeNode(nums[i]);
		int m = (i + j) / 2;
		TreeNode node = new TreeNode(nums[m]);
		node.left = generateBST(i, m-1, nums);
		node.right = generateBST(m+1, j, nums);
		return node;
	}
}
