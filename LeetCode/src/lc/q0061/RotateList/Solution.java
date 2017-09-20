/* Given a list, rotate the list to the right by k places, where k is non-negative.
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 */

package lc.q0061.RotateList;

import lc.ListNode;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    	
    	if (head == null || head.next == null)
    		return head;
    	
    	ListNode newhead = new ListNode(0);
    	newhead.next = head;
        
    	ListNode p = newhead;
    	
    	int len = 0;
    	
    	while (p.next != null)
    	{
    		len ++;
    		p = p.next;
    	}
    	
    	ListNode q = newhead;
    	
    	k = k % len;
    	
    	for (int i = 0; i < len - k; i++)
    		q = q.next;
    	
    	p.next = newhead.next;
    	newhead.next = q.next;
    	q.next = null;
    	
    	return newhead.next;
    }
}
