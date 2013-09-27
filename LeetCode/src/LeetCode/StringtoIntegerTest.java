package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class StringtoIntegerTest {

	@Test
	public void test() {
		StringtoInteger solution = new StringtoInteger();
		Assert.assertEquals(12345, solution.atoi("+12345"));
		Assert.assertEquals(-12345, solution.atoi("-12345"));
		Assert.assertEquals(12345, solution.atoi("   12345   "));
		Assert.assertEquals(123, solution.atoi("   123    45   "));
		Assert.assertEquals(-2147483648, solution.atoi("-2147483648"));

	}
}
