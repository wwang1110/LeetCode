package LeetCode;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class MergekSortedListsTest {

	@Test
	public void test() {
		MergekSortedLists s = new MergekSortedLists();
		ListNode h1 = new ListNode(0);
		h1.next = new  ListNode(2);
		h1.next.next = new  ListNode(4);
		h1.next.next.next = new  ListNode(6);

		ListNode h2 = new ListNode(1);
		h2.next = new  ListNode(3);
		h2.next.next = new  ListNode(5);
		h2.next.next.next = new  ListNode(7);
		h2.next.next.next.next = new  ListNode(9);
		
		ArrayList<ListNode> param = new ArrayList<ListNode>(); 
		param.add(h1);
		param.add(h2);
		
		ListNode h3 = s.mergeKLists(param);
		
		Assert.assertEquals(0, h3.val);
	}

}
