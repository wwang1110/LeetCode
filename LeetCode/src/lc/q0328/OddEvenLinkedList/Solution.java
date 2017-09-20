/* Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
 * 
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 * 
 * Example:
 * Given 1->2->3->4->5->NULL,
 * return 1->3->5->2->4->NULL.
 * 
 * Note:
 * The relative order inside both the even and odd groups should remain as it was in the input.
 * The first node is considered odd, the second node even and so on ...
 * 
 */
package lc.q0328.OddEvenLinkedList;

import lc.ListNode;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
    	if (head == null)
    		return head;
    	ListNode odd = head, even = head.next;
    	ListNode p = odd, q = even;
    	while (p.next!=null&&p.next.next!=null)
    	{
    		p.next = p.next.next;
    		p = p.next;
    		q.next = q.next.next;
    		q = q.next;
    	}
    	p.next = even;
    	return odd;
    }
}
