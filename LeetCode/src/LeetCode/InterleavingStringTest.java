package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class InterleavingStringTest {

	@Test
	public void test() {
		InterleavingString s = new InterleavingString();
		Assert.assertEquals(true, s.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
		Assert.assertEquals(false, s.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
	}

}
