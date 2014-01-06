package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class SortListTest {

	@Test
	public void test1() {
		SortList s = new SortList();
		ListNode head = new ListNode(5);
		head.next = new ListNode(4);
		ListNode newhead = s.sortList(head);
		Assert.assertEquals(4, newhead.val);
	}

	@Test
	public void test2() {
		SortList s = new SortList();
		ListNode head = new ListNode(5);
		head.next = new ListNode(4);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(6);
		head.next.next.next.next = new ListNode(2);
		head.next.next.next.next.next = new ListNode(7);
		ListNode newhead = s.sortList(head);
		Assert.assertEquals(2, newhead.val);
	}

}
