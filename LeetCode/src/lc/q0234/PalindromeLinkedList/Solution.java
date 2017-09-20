/* Given a singly linked list, determine if it is a palindrome.
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 * 
 */
package lc.q0234.PalindromeLinkedList;

import lc.ListNode;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode p = head, q = head;
        
        while (p != null && p.next != null)
        {
        	p = p.next.next;
        	q = q.next;
        }
        
        ListNode tail = reverse(q);
        
        while (head != null && tail != null)
        {
        	if (head.val != tail.val)
        		return false;
        	head = head.next;
        	tail = tail.next;
        }
        return true;
    }

	private ListNode reverse(ListNode q) {
		if (q == null||q.next == null)
			return q;
		ListNode tail = reverse(q.next);
		q.next.next = q;
		q.next = null;
		return tail;
	}
}
