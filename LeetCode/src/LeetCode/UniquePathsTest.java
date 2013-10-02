package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class UniquePathsTest {

	@Test
	public void test() {
		UniquePaths s = new UniquePaths();
		Assert.assertEquals(2, s.uniquePaths(2, 2));
		Assert.assertEquals(3, s.uniquePaths(2, 3));
	}

}
