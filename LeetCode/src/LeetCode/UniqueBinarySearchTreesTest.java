package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class UniqueBinarySearchTreesTest {

	@Test
	public void test() {
		UniqueBinarySearchTrees s = new UniqueBinarySearchTrees();
		Assert.assertEquals(5, s.numTrees(3));
	}

}
