package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class BestTimetoBuyandSellStockIIITest {

	@Test
	public void test() {
		BestTimetoBuyandSellStockIII s = new BestTimetoBuyandSellStockIII();
		Assert.assertEquals(1, s.maxProfit(new int[]{1, 2}));
	}

}
