package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class MinimumPathSumTest {

	@Test
	public void test() {
		MinimumPathSum s = new MinimumPathSum();
		Assert.assertEquals(3, s.minPathSum(new int[][]{{1,1},{1,2}}));
	}

}
