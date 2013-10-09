package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {

	@Test
	public void test() {
		SearchInsertPosition s = new SearchInsertPosition();
		int num[] = new int[]{1,3,5,6};
		//[1,3,5,6], 5 -> 2
		//[1,3,5,6], 2 -> 1
		//[1,3,5,6], 7 -> 4
		//[1,3,5,6], 0 -> 0
		Assert.assertEquals(0, s.searchInsert(num, 0));
		Assert.assertEquals(1, s.searchInsert(num, 2));
		Assert.assertEquals(2, s.searchInsert(num, 5));
		Assert.assertEquals(4, s.searchInsert(num, 7));
	}

}
