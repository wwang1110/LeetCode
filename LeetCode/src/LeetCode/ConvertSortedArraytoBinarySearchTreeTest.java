package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class ConvertSortedArraytoBinarySearchTreeTest {

	@Test
	public void test() {
		ConvertSortedArraytoBinarySearchTree s = new ConvertSortedArraytoBinarySearchTree();
		TreeNode root = s.sortedArrayToBST(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
		//                 5
		//               /    \
		//            2         8
		//          /  \       /  \
		//        1     4    7      10
		//      /      /   /      /
		//     0      3   6     9
		Assert.assertEquals(5, root.val);
	}

}
