/* Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
 * 
 * Design an algorithm to serialize and deserialize a binary search tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary search tree can be serialized to a string and this string can be deserialized to the original tree structure.
 * 
 * The encoded string should be as compact as possible.
 * 
 * Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.
 * 
 */

package lc.q0449.SerializeandDeserializeBST;

import java.util.*;

import lc.TreeNode;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	if(root==null)
    		return "";
    	Queue<TreeNode> que=new LinkedList<TreeNode>();
    	StringBuilder sb=new StringBuilder();
    	que.add(root);
    	while(!que.isEmpty())
    	{
    		TreeNode node=que.poll();
    		if(node.val==-1)
    		{
    			sb.append("#");
    			sb.append("|");
    		}
    		else
    		{
    			sb.append(node.val);
    			sb.append("|");
        		if(node.left!=null)
        			que.add(node.left);
        		else
        			que.add(new TreeNode(-1));
        		
        		if(node.right!=null)
        			que.add(node.right);
        		else
        			que.add(new TreeNode(-1));
    		}
    	}
    	return sb.toString().substring(0, sb.length()-1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes=data.split("\\|");
        if(nodes.length<3)
        	return null;
    	Queue<TreeNode> que=new LinkedList<TreeNode>();
    	TreeNode root=new TreeNode(Integer.parseInt(nodes[0]));
		que.add(root);
    	int i=1;
    	while(i<nodes.length&&!que.isEmpty())
    	{
			TreeNode node=que.poll();
			if(!nodes[i].equals("#"))
			{
				node.left=new TreeNode(Integer.parseInt(nodes[i]));
				que.add(node.left);
			}
			i++;
			if(!nodes[i].equals("#"))
			{
				node.right=new TreeNode(Integer.parseInt(nodes[i]));
				que.add(node.right);
			}
			i++;
    	}
    	return root;
    }
}