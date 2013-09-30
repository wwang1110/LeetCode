package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class TrappingRainWaterTest {

	@Test
	public void test() {
		TrappingRainWater s = new TrappingRainWater();
		int c = s.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
		Assert.assertEquals(6, c);
	}

}
