package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

	@Test
	public void test() {
		PalindromeNumber solution = new PalindromeNumber();
		Assert.assertEquals(false, solution.isPalindrome(321));
		Assert.assertEquals(true, solution.isPalindrome(12321));
		Assert.assertEquals(false, solution.isPalindrome(-321));
		Assert.assertEquals(true, solution.isPalindrome(1001));
	}

}
