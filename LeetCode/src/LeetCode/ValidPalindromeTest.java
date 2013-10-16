package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeTest {

	@Test
	public void test() {
		ValidPalindrome s = new ValidPalindrome();
		Assert.assertEquals(true, s.isPalindrome("A man, a plan, a canal: Panama"));
	}

}
