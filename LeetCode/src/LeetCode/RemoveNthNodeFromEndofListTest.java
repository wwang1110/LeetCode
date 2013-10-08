package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class RemoveNthNodeFromEndofListTest {

	@Test
	public void test() {
		RemoveNthNodeFromEndofList s = new RemoveNthNodeFromEndofList();
		ListNode h = new ListNode(1);
		Assert.assertEquals(null, s.removeNthFromEnd(h, 1));
	}

}
