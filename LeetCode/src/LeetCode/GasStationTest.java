package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class GasStationTest {

	@Test
	public void test() {
		GasStation s = new GasStation();
		Assert.assertEquals(0, s.canCompleteCircuit(new int[]{5}, new int[]{4}));
		Assert.assertEquals(1, s.canCompleteCircuit(new int[]{1, 2}, new int[]{2, 1}));
	}

}
