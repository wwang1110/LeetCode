package LeetCode;

public class RotateList {
	//Given a list, rotate the list to the right by k places, where k is non-negative.

	//For example:
	//Given 1->2->3->4->5->NULL and k = 2,
	//return 4->5->1->2->3->NULL.
	
    public ListNode rotateRight(ListNode head, int n) {
    	if (head == null || head.next == null)
    		return head;

    	ListNode p = head;
    	int len = 0;
    	while (p != null)
    	{
    		p = p.next;
    		len++;
    	}
    	
    	n %= len;
    	
    	ListNode fast = head;
    	for (int i = 0; i < n; i++)
    		fast = fast.next;
    	
    	ListNode slow = head;
    	
    	while (fast.next != null)
    	{
    		fast = fast.next;
    		slow = slow.next;
    	}
    	
    	fast.next = head;
    	head = slow.next;
    	slow.next = null;
    	return head;
    }
}
