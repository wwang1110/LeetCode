package LeetCode;
import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

	@Test
	public void test() {
		LongestCommonPrefix s = new LongestCommonPrefix();
		Assert.assertEquals("",s.longestCommonPrefix(new String[]{"", "b"}));
	}

}
