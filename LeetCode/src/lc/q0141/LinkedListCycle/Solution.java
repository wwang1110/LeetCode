/* Given a linked list, determine if it has a cycle in it.
 * 
 * Follow up:
 * 
 * Can you solve it without using extra space?
 * 
 */

package lc.q0141.LinkedListCycle;

import lc.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
    	ListNode p = head;
    	ListNode q = head;
    	
    	while (p != null && p.next != null)
    	{
    		p = p.next.next;
    		q = q.next;
    		
    		if (p == q)
    			return  true;
    	}
    	return false;
    }
}
