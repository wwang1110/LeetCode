package LeetCode;

public class ReverseLinkedListII {
	//Reverse a linked list from position m to n. Do it in-place and in one-pass.

	//For example:
	//Given 1->2->3->4->5->NULL, m = 2 and n = 4,

	//return 1->4->3->2->5->NULL.

	//Note:
	//Given m, n satisfy the following condition:
	//1 <= m <= n <= length of list.
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	if (head == null || head.next == null || m == n)
    		return head;
    	
    	int i = 1;
    	ListNode node1 = null;
    	ListNode node2 = head;
    	while (i < m)
    	{
    		node1 = node2;
    		node2 = node2.next;
    		i++;
    	}
    	ListNode p = node2;
    	ListNode q = p.next;
    	ListNode r;
    	while (q != null && i < n)
    	{
    		r = q.next;
    		q.next = p;
    		p = q;
    		q = r;
    		i++;
    	}
    	if (node1 != null)
    		node1.next = p;
    	else
    		head = p;
    	
    	if (q != null)
    		node2.next = q;
    	else
    		node2.next = null;
    	
    	return head;
    }	
}
