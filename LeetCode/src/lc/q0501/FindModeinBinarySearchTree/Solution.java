/* Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.
 * 
 * Assume a BST is defined as follows:
 * 
 * The left subtree of a node contains only nodes with keys less than or equal to the node's key.
 * The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * 
 * For example:
 * Given BST [1,null,2,2],
   1
    \
     2
    /
   2
 * return [2].
 * Note: If a tree has more than one mode, you can return them in any order.
 * Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).
 * 
 */

package lc.q0501.FindModeinBinarySearchTree;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public int[] findMode(TreeNode root) {
    	Map<Integer,Integer> map=new HashMap<Integer, Integer>();
    	calcMode(root, map);
    	int mode=0;
    	for(int num: map.keySet())
    		mode=Math.max(mode, map.get(num));
    	List<Integer> list=new ArrayList<Integer>();
    	for(int num: map.keySet())
    		if(map.get(num)==mode)
    			list.add(num);
    	int[] ret= new int[list.size()];
    	for(int i=0;i<list.size();i++)
    		ret[i]=list.get(i);
    	return ret;
	}

	private void calcMode(TreeNode node, Map<Integer, Integer> map) {
		if(node==null)
			return;
		if(!map.containsKey(node.val))
			map.put(node.val, 1);
		else
			map.put(node.val, map.get(node.val)+1);
		calcMode(node.left,map);
		calcMode(node.right,map);
	}

}
