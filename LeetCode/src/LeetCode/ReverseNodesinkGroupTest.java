package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class ReverseNodesinkGroupTest {

	@Test
	public void test() {
		ReverseNodesinkGroup s = new ReverseNodesinkGroup();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode n = s.reverseKGroup(head, 3);
		Assert.assertEquals(3, n.val);
	}

}
