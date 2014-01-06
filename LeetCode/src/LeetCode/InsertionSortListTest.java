package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortListTest {

	@Test
	public void test() {
		InsertionSortList s = new InsertionSortList();
		ListNode head = new ListNode(5);
		head.next = new ListNode(4);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(6);
		head.next.next.next.next = new ListNode(2);
		head.next.next.next.next.next = new ListNode(7);
		ListNode newhead = s.insertionSortList(head);
		Assert.assertEquals(2, newhead.val);
	}

}
