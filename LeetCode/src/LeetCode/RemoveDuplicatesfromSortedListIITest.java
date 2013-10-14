package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesfromSortedListIITest {

	@Test
	public void test() {
		RemoveDuplicatesfromSortedListII s = new RemoveDuplicatesfromSortedListII();
		ListNode head = new ListNode(1);
		head.next = new  ListNode(1);
		head.next.next = new  ListNode(1);
		head.next.next.next = new  ListNode(2);
		head.next.next.next.next = new  ListNode(3);
		ListNode node = s.deleteDuplicates(head);
		Assert.assertEquals(2, node.val);
		Assert.assertEquals(3, node.next.val);
	}

}
