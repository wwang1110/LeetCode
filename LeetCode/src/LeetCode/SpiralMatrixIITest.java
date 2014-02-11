package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class SpiralMatrixIITest {

	@Test
	public void test() {
		SpiralMatrixII s = new SpiralMatrixII();
		int num[][] = s.generateMatrix(3);
		Assert.assertEquals(num[1][1], 9);
	}

}
