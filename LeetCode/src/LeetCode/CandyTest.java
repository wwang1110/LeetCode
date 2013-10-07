package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class CandyTest {

	@Test
	public void test() {
		Candy s = new Candy();
		Assert.assertEquals(10, s.candy(new int[]{1, 2, 3, 4}));
		Assert.assertEquals(6, s.candy(new int[]{1, 3, 2, 4}));
		Assert.assertEquals(7, s.candy(new int[]{1, 3, 4, 2}));
		Assert.assertEquals(8, s.candy(new int[]{3, 1, 2, 4}));
	}

}
