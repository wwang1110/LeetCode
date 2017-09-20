/* Given the root of a tree, you are asked to find the most frequent subtree sum. The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself). So what is the most frequent subtree sum value? If there is a tie, return all the values with the highest frequency in any order.
 * Examples 1
 * Input:

  5
 /  \
2   -3
 * return [2, -3, 4], since all the values happen only once, return all of them in any order.
 * Examples 2
 * 
 * Input:

  5
 /  \
2   -5
 * return [2], since 2 happens twice, however -5 only occur once.
 * Note: You may assume the sum of values in any subtree is in the range of 32-bit signed integer.
 * 
 */

package lc.q0508.MostFrequentSubtreeSum;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {
    	Map<Integer, Integer> map=new HashMap<Integer, Integer>();
    	generateTreeSum(root, map);
    	int maxcount=0;
    	for(int sum: map.keySet())
			maxcount=Math.max(map.get(sum), maxcount);
    	List<Integer> list=new ArrayList<Integer>();
    	for(int sum:map.keySet())
    		if(map.get(sum)==maxcount)
    			list.add(sum);
    	int[] ret=new int[list.size()];
    	for(int i=0;i<list.size();i++)
    		ret[i]=list.get(i);
    	return ret;
    		
    }

	private int generateTreeSum(TreeNode node, Map<Integer, Integer> map) {
		if(node==null)
			return 0;
		int sum= node.val+generateTreeSum(node.left, map)+generateTreeSum(node.right, map);
		if(map.containsKey(sum))
			map.put(sum, map.get(sum)+1);
		else
			map.put(sum, 1);
		return sum;
	}
}
