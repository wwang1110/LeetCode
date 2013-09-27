package LeetCode;


import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

	@Test
	public void testReverse() {
		ReverseInteger solution = new ReverseInteger();
		Assert.assertEquals(123, solution.reverse(321));
		Assert.assertEquals(-123, solution.reverse(-321));
		Assert.assertEquals(1, solution.reverse(100));
	}

}
