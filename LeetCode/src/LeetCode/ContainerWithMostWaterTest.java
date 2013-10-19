package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWaterTest {

	@Test
	public void test() {
		ContainerWithMostWater s = new ContainerWithMostWater();
		Assert.assertEquals(0, s.maxArea(new int[] {0, 2}));
		Assert.assertEquals(0, s.maxArea(new int[] {2, 0}));
		Assert.assertEquals(2, s.maxArea(new int[] {1, 2, 1}));
	}
}
