package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class WildcardMatchingTest {

	@Test
	public void test() {
		WildcardMatching s = new WildcardMatching();
		Assert.assertEquals(false, s.isMatch("aa","a"));
		Assert.assertEquals(true, s.isMatch("aa", "*"));
		Assert.assertEquals(true, s.isMatch("bbaaababbaaababababbb", "*a*****bb"));
		Assert.assertEquals(false, s.isMatch("abc", "*ab"));
		Assert.assertEquals(false, s.isMatch("", "*a*"));
		
	}

}
