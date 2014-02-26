package Test;

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
    
    public static void main(String[] args) {
    	TreeNode root = new TreeNode(1);
    	root.left = new TreeNode(2);
    	root.left.left = new TreeNode(3);
    	root.left.right = new TreeNode(4);
    	root.right = new TreeNode(5);
    	root.right.left = new TreeNode(6);
    	root.right.right = new TreeNode(7);
    	
    	BinarySearchTree bst = new BinarySearchTree();
    	bst.preorder(root);    
    }
}
