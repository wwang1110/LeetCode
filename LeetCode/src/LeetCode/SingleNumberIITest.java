package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumberIITest {

	@Test
	public void test() {
		SingleNumberII s = new SingleNumberII();
		Assert.assertEquals(3, s.singleNumber(new int[] {1, 1, 2, 1, 2, 3, 2}));
		Assert.assertEquals(-3, s.singleNumber(new int[] {-1, -1, 2, -1, 2, -3, 2}));
	}

}
