package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class DistinctSubsequencesTest {

	@Test
	public void test() {
		DistinctSubsequences s = new DistinctSubsequences();
		Assert.assertEquals(3, s.numDistinct("rabbbit", "rabbit"));
	}

}
