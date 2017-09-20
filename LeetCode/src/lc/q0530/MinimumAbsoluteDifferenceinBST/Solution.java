/* Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.
 * 
 * Example:
 * 
 * Input:

   1
    \
     3
    /
   2

 * Output:
 * 1
 * 
 * Explanation:
 * The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
 * Note: There are at least two nodes in this BST.
 * 
 */
package lc.q0530.MinimumAbsoluteDifferenceinBST;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public int getMinimumDifference(TreeNode root) {
    	List<Integer> list=new ArrayList<Integer>();
        generateList(root, list);
        Collections.sort(list);
        int mindiff=Integer.MAX_VALUE;
        for(int i=list.size()-1;i>0;i--)
        	mindiff=Math.min(mindiff, list.get(i)-list.get(i-1));
        return mindiff;
    }

	private void generateList(TreeNode root, List<Integer> list) {
		if(root==null)
			return;
		list.add(root.val);
		generateList(root.left, list);
		generateList(root.right, list);
	}
}
