package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class JumpGameTest {

	@Test
	public void test() {
		JumpGame s = new JumpGame();
		Assert.assertEquals(true, s.canJump(new int[]{2,3,1,1,4}));
		Assert.assertEquals(false, s.canJump(new int[]{3,2,1,0,4}));
	}

}
