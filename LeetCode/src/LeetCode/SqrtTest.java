package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class SqrtTest {

	@Test
	public void test() {
		Sqrt s = new Sqrt();
		Assert.assertEquals(10, s.sqrt(100));
		Assert.assertEquals(10, s.sqrt(101));
	}

}
