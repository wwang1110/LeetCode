package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BinarySearchTree {
    public void visit(TreeNode node) {
        System.out.println(node.val);
    }

    public void preorder(TreeNode root)
    {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(new TreeNode(-1));
        
        TreeNode node = root;
        while(!stack.isEmpty()){
            if (node != null) 
            {
                visit(node);
                stack.push(node);
                node = node.left;
            }
            else 
            {
                node = stack.pop();
                node = node.right;
            }
        }
    }

    public void inorder(TreeNode root)
    {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(new TreeNode(-1));
        
        TreeNode node = root;
        while(!stack.isEmpty()){
            if (node != null) 
            {
                stack.push(node);
                node = node.left;
            }
            else 
            {
                node = stack.pop();
                visit(node);
                node = node.right;
            }
        }
    }

    public void postorder(TreeNode root)
    {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(new TreeNode(-1));
        Map<TreeNode, Integer> map = new HashMap<TreeNode, Integer>();
        
        TreeNode node = root;
        while(!stack.isEmpty()){
            if (node != null)
            {
                stack.push(node);
                map.put(node, 1);
                node = node.left;
            }
            else
            {
                node = stack.peek();
                if (map.get(node) == 1)
                {
                    map.put(node, 2);
                    node = node.right;
                }
                else if (map.get(node) == 2)
                {
                    node = stack.pop();
                    visit(node);
                    node = null;
                }
            }
        }
    }
    public boolean isValid(TreeNode node) {
    	return isValid(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private boolean isValid(TreeNode node, int minValue, int maxValue) {
    	
    	if (node == null)
    		return true;
    	
    	if (node.val < minValue || node.val > maxValue)
    		return false;
    	
		return isValid(node.left, minValue, node.val) && isValid(node.right, node.val, maxValue);
	}

	public static void main(String[] args) {
    	TreeNode root = new TreeNode(1);
    	root.left = new TreeNode(2);
    	root.left.left = new TreeNode(3);
    	root.left.right = new TreeNode(4);
    	root.right = new TreeNode(5);
    	root.right.left = new TreeNode(6);
    	root.right.right = new TreeNode(7);
    	
    	BinarySearchTree bst = new BinarySearchTree();
    	//bst.preorder(root);  
    	//bst.inorder(root);
    	bst.postorder(root);
    }
}
