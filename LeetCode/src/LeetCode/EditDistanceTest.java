package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class EditDistanceTest {

	@Test
	public void test() {
		EditDistance s = new EditDistance();
		Assert.assertEquals(0, s.minDistance("a", "a"));
	}

}
