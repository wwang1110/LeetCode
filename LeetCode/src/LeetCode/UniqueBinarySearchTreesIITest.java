package LeetCode;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UniqueBinarySearchTreesIITest {

	@Test
	public void test() {
		UniqueBinarySearchTreesII s = new UniqueBinarySearchTreesII();
		ArrayList<TreeNode> r1 = s.generateTrees(1);
		ArrayList<TreeNode> r2 = s.generateTrees(2);
		ArrayList<TreeNode> r3 = s.generateTrees(3);
	}

}
