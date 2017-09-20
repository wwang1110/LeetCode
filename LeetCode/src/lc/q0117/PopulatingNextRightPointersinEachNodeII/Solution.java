/* Follow up for problem "Populating Next Right Pointers in Each Node".
 * 
 * What if the given tree could be any binary tree? Would your previous solution still work?
 * 
 * Note:
 * 
 * You may only use constant extra space.
 * 
 * For example,
 * 
 * Given the following binary tree,
         1
       /  \
      2    3
     / \    \
    4   5    7
 * After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \    \
    4-> 5 -> 7 -> NULL
 * 
 */

package lc.q0117.PopulatingNextRightPointersinEachNodeII;

import lc.TreeLinkNode;

public class Solution {
    @SuppressWarnings("null")
	public void connect(TreeLinkNode root) {
        TreeLinkNode ltmp = new TreeLinkNode(0);
        while (root != null)
        {
        	ltmp = null;
            TreeLinkNode cur = ltmp;
        	while(root != null)
        	{
        		if (root.left != null)
        		{
        			cur.next = root.left;
        			cur = cur.next;
        		}
        		
        		if (root.right != null)
        		{
        			cur.next = root.right;
        			cur = cur.next;
        		}
        		root = root.next;
        	}
        	root = ltmp.next;
        }
    }
    
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	
    	TreeLinkNode root = new TreeLinkNode(1);
    	root.left = new TreeLinkNode(2);
    	s.connect(root);
    }
}
