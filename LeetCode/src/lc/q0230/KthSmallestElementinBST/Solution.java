/* Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 * 
 * Note:
 * You may assume k is always valid, 1 <= k <= BST's total elements.
 * 
 * Follow up:
 * What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?
 * 
 */

package lc.q0230.KthSmallestElementinBST;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Map<TreeNode, Integer> map = new HashMap<TreeNode, Integer>();
        countNode(root, map);
        return findNode(root, k, map);
    }

	private int findNode(TreeNode node, int k, Map<TreeNode, Integer> map) {
		if (node == null)
			return -1;
		int left = 0;
		if (node.left != null)
			left = map.get(node.left);
		if (left == k - 1)
			return node.val;
		if (left >= k)
			return findNode(node.left, k, map);
		else return findNode(node.right, k-1-left, map);
	}

	private int countNode(TreeNode node, Map<TreeNode, Integer> map) {
		if (node == null)
			return 0;
		int total = 1 + countNode(node.right,map) + countNode(node.left, map);
		map.put(node, total);
		return total;
	}
}
