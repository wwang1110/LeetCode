package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedListIITest {

	@Test
	public void test() {
		ReverseLinkedListII s = new ReverseLinkedListII();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode ret = s.reverseBetween(head, 2, 4);
		Assert.assertEquals(1, ret.val);
	}

}
