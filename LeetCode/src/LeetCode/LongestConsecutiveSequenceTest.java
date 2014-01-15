package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class LongestConsecutiveSequenceTest {

	@Test
	public void test() {
		LongestConsecutiveSequence s = new LongestConsecutiveSequence();
		Assert.assertEquals(4, s.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
	}

}
