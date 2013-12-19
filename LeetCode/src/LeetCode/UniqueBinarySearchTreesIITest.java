package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class UniqueBinarySearchTreesIITest {

	@Test
	public void test() {
		UniqueBinarySearchTreesII s = new UniqueBinarySearchTreesII();
		ArrayList<TreeNode> r1 = s.generateTrees(1);
		Assert.assertEquals(1, r1.size());
		ArrayList<TreeNode> r2 = s.generateTrees(2);
		Assert.assertEquals(2, r2.size());
		ArrayList<TreeNode> r3 = s.generateTrees(3);
		Assert.assertEquals(5, r3.size());
	}

}
