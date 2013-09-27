package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubstringTest {

	@Test
	public void test1() {
		LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
		Assert.assertEquals("anana",solution.longestPalindrome("bananas"));
	}

	@Test
	public void test2() {
		LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
		Assert.assertEquals("cddc",solution.longestPalindrome("abcddcefh"));
	}
}
