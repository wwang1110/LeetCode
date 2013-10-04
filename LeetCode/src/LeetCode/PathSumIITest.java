package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class PathSumIITest {

	@Test
	public void test1() {
		PathSumII s = new PathSumII();
		//              5
		//             / \
		//            4   8
		//           /   / \
		//          11  13  4
		//         /  \    / \
		//        7    2  5   1	
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.left = new TreeNode(5);
		root.right.right.right = new TreeNode(1);
		
		ArrayList<ArrayList<Integer>> ret = s.pathSum(root, 22);
		Assert.assertEquals(2, ret.size());
	}

	@Test
	public void test2() {
		PathSumII s = new PathSumII();
		TreeNode root = new TreeNode(-2);
		root.left = new TreeNode(-3);
	
		ArrayList<ArrayList<Integer>> ret = s.pathSum(root, -5);
		Assert.assertEquals(1, ret.size());
	}	
}
