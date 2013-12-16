package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class MinimumWindowSubstringTest {

	@Test
	public void test() {
		MinimumWindowSubstring s = new MinimumWindowSubstring();
		Assert.assertEquals("ACD", s.minWindow("ABCDEFGACDEFG", "ACD"));
	}

}
