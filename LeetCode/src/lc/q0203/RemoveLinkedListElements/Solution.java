/* Remove all elements from a linked list of integers that have value val.
 * 
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 * 
 */

package lc.q0203.RemoveLinkedListElements;

import lc.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode nh = new ListNode(0);
        nh.next = head;
        
        ListNode q = nh;
        ListNode p = q.next;
        while(p != null)
        {
        	if (p.val != val)
        		q = q.next;
        	p = p.next;

        	q.next = p;
        }
        
        return nh.next;
    }
}
