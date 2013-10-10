package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class SearchforaRangeTest {

	@Test
	public void test1() {
		SearchforaRange s = new SearchforaRange();
		int ret[] = s.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
		Assert.assertEquals(3, ret[0]);
		Assert.assertEquals(4, ret[1]);
	}

	@Test
	public void test2() {
		SearchforaRange s = new SearchforaRange();
		int ret[] = s.searchRange(new int[]{1, 5}, 4);
		Assert.assertEquals(-1, ret[0]);
		Assert.assertEquals(-1, ret[1]);
	}
}
