/* Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * 
 * Note: Do not modify the linked list.
 * 
 * Follow up:
 * 
 * Can you solve it without using extra space?
 * 
 */
package lc.q0142.LinkedListCycleII;

import lc.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
    	ListNode p = head;
    	ListNode q = head;
    	
    	while (p != null && p.next != null)
    	{
    		p = p.next.next;
    		q = q.next;
    		
    		if (p == q)
    			break;
    	}
    	
    	if (p == null || p.next == null)
    		return null;
    	
    	ListNode k = head;
    	
    	while (k != p)
    	{
    		k = k.next;
    		p = p.next;
    	}
    	
    	return p;
    }
}
