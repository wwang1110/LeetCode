package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class PartitionListTest {

	@Test
	public void test() {
		PartitionList s = new PartitionList();
		//1->4->3->2->5->2
		ListNode head = new ListNode(1);
		head.next = new ListNode(4);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(2);
		ListNode node = s.partition(head, 3);
		//1->2->2->4->3->5
		Assert.assertEquals(1, node.val);
	}

}
