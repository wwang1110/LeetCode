package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListCycleIITest {

	@Test
	public void test() {
		LinkedListCycleII s = new LinkedListCycleII();
		ListNode head = new ListNode(0);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next.next = new ListNode(7);
		head.next.next.next.next.next.next.next.next = head.next.next.next.next;
		Assert.assertEquals(head.next.next.next.next,s.detectCycle(head));
	}

}
