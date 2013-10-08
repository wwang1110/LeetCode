package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class ThreeSumClosestTest {

	@Test
	public void test() {
		ThreeSumClosest s = new ThreeSumClosest();
		Assert.assertEquals(2, s.threeSumClosest(new int[]{-1,2,1,-4}, 1));
	}

}
