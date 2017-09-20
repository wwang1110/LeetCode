/* Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * 
 * For example:
 * 
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 * 
 * return 1->4->3->2->5->NULL.
 * 
 * Note:
 * 
 * Given m, n satisfy the following condition:
 * 
 * 1 <= m <= n <= length of list.
 * 
 */

package lc.q0092.ReverseLinkedListII;

import lc.ListNode;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	
    	if (m == n)
    		return head;
    	
    	ListNode nh = new ListNode(0);
        nh.next = head;
        ListNode p1 = null;
        ListNode p2 = null;
        ListNode p3 = null;
        ListNode p = nh;

        int i = 1;
        while (i <= n + 1)
        {
        	if (i == m) p1 = p;
        	p = p.next;
        	i++;
        }
        
        p2 = p1.next;
        
        p3 = p;
        
        p1.next = reverse(p2, n-m);
        
        p2.next = p3;
        
        return nh.next;
    }

	private ListNode reverse(ListNode p, int num) {
		if (p == null)
			return null;
		
		if (num == 0 || p.next == null)
			return p;
			
		ListNode root = reverse(p.next, num-1);
		
		p.next.next = p;
		
		return root;
	}
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	ListNode head = new ListNode(1);
    	head.next = new ListNode(2);
    	head.next.next = new ListNode(3);
    	s.reverseBetween(head, 1, 2);
    }	
}