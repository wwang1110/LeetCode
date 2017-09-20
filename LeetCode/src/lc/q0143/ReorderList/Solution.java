/* Given a singly linked list L: L0?L1?…?Ln-1?Ln,
 * 
 * reorder it to: L0?Ln?L1?Ln-1?L2?Ln-2?…
 * 
 * You must do this in-place without altering the nodes' values.
 * 
 * For example,
 * Given {1,2,3,4}, reorder it to {1,4,2,3}.
 * 
 */

package lc.q0143.ReorderList;

import lc.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        
        if (head == null)
            return;
        
    	ListNode p = head;
    	ListNode q = head;
    	
    	while (p != null && p.next != null&&p.next.next != null)
    	{
    		p = p.next.next;
    		q = q.next;
    	}
    	
    	ListNode r = q.next;
    	ListNode rhead = revert(r);
    	q.next = null;
        if (r != null)
    	    r.next = null;

    	p = head;
    	q = rhead;
    	while(p != null && q != null)
    	{
    		r = q.next;
    		q.next = p.next;
    		p.next = q;
    		p = p.next.next;
    		q = r;
    	}
    }

	private ListNode revert(ListNode q) {
		if (q == null )
			return null;
		if (q.next == null)
			return q;
		ListNode node = revert(q.next);
		q.next.next = q;
		return node;
	}
}
