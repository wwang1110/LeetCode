package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

	@Test
	public void test() {
		TwoSum twoSum = new TwoSum();
		int[] ret = twoSum.twoSum(new int[]{2, 7, 11, 13}, 9);
		
		Assert.assertEquals(1, ret[0]);
		Assert.assertEquals(2, ret[1]);
		
	}

}
