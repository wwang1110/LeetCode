package LeetCode;

import org.junit.Test;

public class ReorderListTest {

	@Test
	public void test() {
		ReorderList s = new ReorderList();
		ListNode head = new ListNode(0);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next.next = new ListNode(7);
		s.reorderList(head);
	}

}
