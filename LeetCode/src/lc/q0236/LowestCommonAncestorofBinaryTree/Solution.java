/* Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

        _______3______
       /              \
    ___5__          ___1__
   /      \        /      \
   6      _2       0       8
         /  \
         7   4
 * For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3. Another example is LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
 * 
 */
package lc.q0236.LowestCommonAncestorofBinaryTree;
import java.util.*;

import lc.TreeNode;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	List<List<TreeNode>> paths = new ArrayList<List<TreeNode>>();
    	fillPath(root, p, new ArrayList<TreeNode>(), paths);
    	fillPath(root, q, new ArrayList<TreeNode>(), paths);

    	List<TreeNode> pathA = paths.get(0); 
    	pathA.add(null);
    	List<TreeNode> pathB = paths.get(1); 
    	pathB.add(null);
    	for (int i = 0; i < pathA.size() && i < pathB.size(); i++)
    		if (pathA.get(i) != pathB.get(i))
    			return pathA.get(i-1);
    	
    	return null;
    }

	private void fillPath(TreeNode node, TreeNode p, List<TreeNode> l, List<List<TreeNode>> paths ) {
		if(node == null)
			return;
		if (node == p)
		{
            l.add(node);
			paths.add(new ArrayList<TreeNode>(l));
		    l.remove(l.size()-1);
			return;
		}
		l.add(node);
		fillPath(node.left, p, l, paths);
		fillPath(node.right, p, l, paths);
		l.remove(l.size()-1);
	}
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	TreeNode root = new TreeNode(1);
    	root.right = new TreeNode(2);
    	s.lowestCommonAncestor(root, new TreeNode(1), new TreeNode(2));
    }
}
