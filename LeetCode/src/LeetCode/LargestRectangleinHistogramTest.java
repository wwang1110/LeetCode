package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class LargestRectangleinHistogramTest {

	@Test
	public void test() {
		LargestRectangleinHistogram s = new LargestRectangleinHistogram();
		Assert.assertEquals(3, s.largestRectangleArea(new int[]{2, 1, 2}));
	}

}
