/* Sort a linked list using insertion sort.
 * 
 */
package lc.q0147.InsertionSortList;

import lc.ListNode;

public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode nh = new ListNode(0);
        while (head != null)
        {
            ListNode q = head;
            head = head.next;
            
            ListNode p = nh;
            while(p.next != null)
            {
            	if (q.val <= p.next.val)
            		break;
            	p = p.next;
            }
            q.next = p.next;
            p.next = q;
        }
        return nh.next;
    }
}
