package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class DecodeWaysTest {

	@Test
	public void test() {
		DecodeWays s = new DecodeWays();
		Assert.assertEquals(2, s.numDecodings("12"));
		Assert.assertEquals(3, s.numDecodings("123"));
		Assert.assertEquals(1, s.numDecodings("103"));
		Assert.assertEquals(1, s.numDecodings("27"));
		Assert.assertEquals(0, s.numDecodings("301"));
	}

}
