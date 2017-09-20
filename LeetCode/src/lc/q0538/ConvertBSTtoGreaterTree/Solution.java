/* Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.
 * 
 * Example:
 * 
 * Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

 * Output: The root of a Greater Tree like this:
             18
            /   \
          20     13
 * 
 */

package lc.q0538.ConvertBSTtoGreaterTree;

import java.util.*;

import lc.TreeNode;

public class Solution {
    public TreeNode convertBST(TreeNode root) {
        List<TreeNode> list=new ArrayList<TreeNode>();
        travleBST(root, list);
        int sum=0;
        for(int i=list.size()-1;i>=0;i--)
        {
        	int val=list.get(i).val;
        	list.get(i).val+=sum;
        	sum+=val;
        }
        return root;
    }

	private void travleBST(TreeNode root, List<TreeNode> list) {
		if(root==null)
			return;
		travleBST(root.left, list);
		list.add(root);
		travleBST(root.right, list);
	}
}
