package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionMatchingTest {

	@Test
	public void test() {
		//isMatch("aa","a")  false
		//isMatch("aa","aa")  true
		//isMatch("aaa","aa")  false
		//isMatch("aa", "a*")  true
		//isMatch("aa", ".*")  true
		//isMatch("ab", ".*")  true
		//isMatch("aab", "c*a*b")  true
		RegularExpressionMatching solution = new RegularExpressionMatching();
		Assert.assertEquals(false, solution.isMatch("aa", "a"));
		Assert.assertEquals(true, solution.isMatch("aa", "aa"));
		Assert.assertEquals(false, solution.isMatch("aaa", "aa"));
		Assert.assertEquals(true, solution.isMatch("aa", "a*"));
		Assert.assertEquals(false, solution.isMatch("aa", "a"));
		Assert.assertEquals(false, solution.isMatch("aa", "a"));
		Assert.assertEquals(false, solution.isMatch("aa", "a"));
		Assert.assertEquals(true, solution.isMatch("aab", "c*a*b"));
		Assert.assertEquals(true, solution.isMatch("bbbba", ".*a*a"));
		
	}

}
