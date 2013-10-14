package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesfromSortedListTest {

	@Test
	public void test1() {
		RemoveDuplicatesfromSortedList s = new RemoveDuplicatesfromSortedList();
		ListNode head = new ListNode(1);
		head.next = new  ListNode(1);
		head.next.next = new  ListNode(2);
		ListNode node = s.deleteDuplicates(head);
		Assert.assertEquals(1, node.val);
		Assert.assertEquals(2, node.next.val);
	}

	@Test
	public void test2() {
		RemoveDuplicatesfromSortedList s = new RemoveDuplicatesfromSortedList();
		ListNode head = new ListNode(1);
		head.next = new  ListNode(1);
		head.next.next = new  ListNode(2);
		head.next.next.next = new  ListNode(3);
		head.next.next.next.next = new  ListNode(3);
		ListNode node = s.deleteDuplicates(head);
		Assert.assertEquals(1, node.val);
		Assert.assertEquals(2, node.next.val);
		Assert.assertEquals(3, node.next.next.val);
	}
}
