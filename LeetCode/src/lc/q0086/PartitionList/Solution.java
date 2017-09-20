/* Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * 
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * 
 * For example,
 * 
 * Given 1->4->3->2->5->2 and x = 3,
 * 
 * return 1->2->2->4->3->5.
 * 
 */

package lc.q0086.PartitionList;

import lc.ListNode;

public class Solution {
    public ListNode partition(ListNode head, int x) {
    	if (head == null)
    		return head;
    	
    	ListNode partition1 = new ListNode(0);
    	ListNode partition2 = new ListNode(0);
    	
    	ListNode p = head;
    	ListNode p1 = partition1;
    	ListNode p2 = partition2;
    	while (p != null)
    	{
    		if (p.val < x)
    		{
    			p1.next = p;
    			p1 = p1.next;
    		}
    		else
    		{
    			p2.next = p;
    			p2 = p2.next;
    		}
    		
    		p = p.next;
    	}
    	
    	p1.next = partition2.next;
    	p2.next = null;
    	return partition1.next;
    }
}
