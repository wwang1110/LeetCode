package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class DivideTwoIntegersTest {

	@Test
	public void test() {
		DivideTwoIntegers s = new DivideTwoIntegers();
		//Assert.assertEquals(25, s.divide(101, 4));
		//Assert.assertEquals(2147483647, s.divide(2147483647, 1));
		Assert.assertEquals(0, s.divide(-1010369383, -2147483648));
		
	}

}
