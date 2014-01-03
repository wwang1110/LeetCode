package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

class MarkedNode
{
	public TreeNode node;
	public int visit;
	public MarkedNode(TreeNode n, int v){
		node = n;
		visit = v;
	}
};

public class BinaryTreePostorderTraversal {
	//Given a binary tree, return the postorder traversal of its nodes' values.

	//For example:
	//Given binary tree {1,#,2,3},
	//		   1
	//		    \
	//		     2
	//		    /
	//		   3
	//		return [3,2,1].

	//Note: Recursive solution is trivial, could you do it iteratively?
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
    	ArrayList<Integer> ret = new ArrayList<Integer>();
        Stack<MarkedNode> s = new Stack<MarkedNode>(); 
        
        s.push(new MarkedNode(root, 0));
        TreeNode node = root;
        while(!s.isEmpty())
        {
        	if (node != null)
        	{
                node = node.left;
                s.push(new MarkedNode(node, 0));
        	}
        	else
        	{
        		MarkedNode mn = s.pop();
        		if (mn.node == null)
        			node = null;
        		else if (mn.visit == 0)
        		{
        			mn.visit ++;
                    s.push(mn);

                    node = mn.node.right;
                    s.push(new MarkedNode(node, 0));
        		}
        		else
        		{
        			ret.add(mn.node.val);;
        			node = null;
        		}
        	}
        }
        
        return ret;
    }	
}
