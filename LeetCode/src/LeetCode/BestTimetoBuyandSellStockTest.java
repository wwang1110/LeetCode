package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class BestTimetoBuyandSellStockTest {

	@Test
	public void test() {
		BestTimetoBuyandSellStock s = new BestTimetoBuyandSellStock();
		Assert.assertEquals(6, s.maxProfit(new int[]{6,1,3,2,4,7}));
	}

}
