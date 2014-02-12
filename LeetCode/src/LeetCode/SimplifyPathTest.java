package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class SimplifyPathTest {

	@Test
	public void test() {
		SimplifyPath s = new SimplifyPath();
		Assert.assertEquals("/c", s.simplifyPath("/a/./b/../../c/"));
		Assert.assertEquals("/c", s.simplifyPath("/.."));
	}

}
