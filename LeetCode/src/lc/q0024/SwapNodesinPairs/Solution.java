/* Given a linked list, swap every two adjacent nodes and return its head.
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */

package lc.q0024.SwapNodesinPairs;

import lc.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode newhead = new ListNode(0);
        
        newhead.next = head;
        ListNode p = newhead;
        
        while (p != null && p.next != null && p.next.next != null)
        {
        	ListNode q = p.next;
        	ListNode k = p.next.next;
        	
        	q.next = k.next;
        	k.next = p.next;
        	p.next = k;
        	p = q;
        }
        
        return newhead.next;
    }
}
