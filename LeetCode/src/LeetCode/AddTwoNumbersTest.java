package LeetCode;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {

	@Test
	public void test1() {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		AddTwoNumbers solution = new AddTwoNumbers();
		ListNode l3 = solution.addTwoNumbers(l1, l2);
		
		Assert.assertEquals(7, l3.val);
		Assert.assertEquals(0, l3.next.val);
		Assert.assertEquals(8, l3.next.next.val);
	}
	@Test
	public void test2() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(8);

		ListNode l2 = new ListNode(0);

		AddTwoNumbers solution = new AddTwoNumbers();
		ListNode l3 = solution.addTwoNumbers(l1, l2);
		
		Assert.assertEquals(1, l3.val);
		Assert.assertEquals(8, l3.next.val);
	}
}
