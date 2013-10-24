package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class MinimumPathSumTest {

	@Test
	public void test1() {
		MinimumPathSum s = new MinimumPathSum();
		Assert.assertEquals(3, s.minPathSum(new int[][]{{1,1},{1,2}}));
	}
	@Test
	public void test2() {
		MinimumPathSum s = new MinimumPathSum();
		Assert.assertEquals(7, s.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
	}

}
