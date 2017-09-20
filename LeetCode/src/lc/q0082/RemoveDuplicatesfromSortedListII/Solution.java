/* Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 * For example,
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 *  Given 1->1->1->2->3, return 2->3.
 * 
 */

package lc.q0082.RemoveDuplicatesfromSortedListII;

import lc.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    	
    	ListNode newh = new ListNode(0);
    	newh.next = head;
    	
    	ListNode p = newh;
    	while (p.next != null && p.next.next != null)
    	{
    		if (p.next.val != p.next.next.val)
    			p = p.next;
    		else
    		{
        		ListNode q = p.next;
    			while (q.next != null && q.val == q.next.val)
    				q = q.next;
    			p.next = q.next;
    		}
    	}
    	
    	return newh.next;
    }
}
