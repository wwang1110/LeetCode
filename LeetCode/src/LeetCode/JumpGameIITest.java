package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class JumpGameIITest {

	@Test
	public void test() {
		JumpGameII s = new JumpGameII();
		int steps = s.jump(new int[]{2,3,1,1,4});
		Assert.assertEquals(2, steps);
	}

}
