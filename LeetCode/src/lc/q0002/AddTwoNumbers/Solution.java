
/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */

package lc.q0002.AddTwoNumbers;

import lc.ListNode;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode ret = null;
		ListNode l3 = null;
		int of = 0;
		while (l1 != null || l2 != null || of != 0)
		{
			int nv = of;
			
			if (l1 != null)
			{
				nv += l1.val;
				l1 = l1.next;
			}
			
			if (l2 != null)
			{
				nv += l2.val;
				l2 = l2.next;
			}
			
			of = nv / 10;
			
			nv = nv % 10;
			
			if (l3 == null)
			{
				ret = new ListNode(nv);
				l3 = ret;
			}
			else
			{
				l3.next = new ListNode(nv);
				l3 = l3.next;
			}
		}
		
		return ret;
    }
}
