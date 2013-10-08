package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class LongestValidParenthesesTest {

	@Test
	public void test() {
		LongestValidParentheses s = new LongestValidParentheses();
		Assert.assertEquals(4, s.longestValidParentheses(")()())"));
		Assert.assertEquals(2, s.longestValidParentheses("()(()"));
	}

}
