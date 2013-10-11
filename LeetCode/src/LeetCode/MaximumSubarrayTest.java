package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarrayTest {

	@Test
	public void test() {
		MaximumSubarray s = new MaximumSubarray();
		Assert.assertEquals(6, s.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
	}

}
