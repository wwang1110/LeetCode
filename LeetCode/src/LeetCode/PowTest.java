package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class PowTest {

	@Test
	public void test() {
		Pow s = new Pow();
		Assert.assertEquals(64.0, s.pow(4.0, 3), 0.01);
		Assert.assertEquals(1024.0, s.pow(2.0, 10), 0.01);
		Assert.assertEquals(1.0, s.pow(2.0, 0), 0.01);
	}

}
