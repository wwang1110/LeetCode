package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyStringsTest {

	@Test
	public void test() {
		MultiplyStrings s = new MultiplyStrings();
		Assert.assertEquals("625", s.multiply("25", "25"));
		Assert.assertEquals("152399025", s.multiply("12345", "12345"));
		Assert.assertEquals("0", s.multiply("0", "52"));
	}

}
