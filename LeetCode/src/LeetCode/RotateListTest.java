package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class RotateListTest {

	@Test
	public void test() {
		RotateList s = new RotateList();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode n = s.rotateRight(head, 2);
		
		Assert.assertEquals(4, n.val);
	}

}
