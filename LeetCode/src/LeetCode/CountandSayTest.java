package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class CountandSayTest {

	@Test
	public void test() {
		CountandSay s = new CountandSay();
		//1, 11, 21, 1211, 111221, ...
		Assert.assertEquals("1", s.countAndSay(1));
		Assert.assertEquals("11", s.countAndSay(2));
		Assert.assertEquals("21", s.countAndSay(3));
		Assert.assertEquals("1211", s.countAndSay(4));
		Assert.assertEquals("111221", s.countAndSay(5));
	}

}
