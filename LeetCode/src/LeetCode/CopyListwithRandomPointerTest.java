package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class CopyListwithRandomPointerTest {

	@Test
	public void test() {
		CopyListwithRandomPointer s = new CopyListwithRandomPointer();
		RandomListNode head = new RandomListNode(1);
		head.next = new RandomListNode(2);
		head.next.next = new RandomListNode(3);
		head.random = head.next.next;
		head.next.random = head;
		head.next.next.random = head.next;
		RandomListNode h = s.copyRandomList(head);
		Assert.assertEquals(3, h.random.label);
	}

}
