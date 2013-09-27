package LeetCode;

public class AddTwoNumbers {
	//You are given two linked lists representing two non-negative numbers. 
	//The digits are stored in reverse order and each of their nodes contain a single digit. 
	//Add the two numbers and return it as a linked list.

	//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	//Output: 7 -> 0 -> 8
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	if (l1 == null)
    		return l2;
    	if (l2 == null)
    		return l1;

    	ListNode p1= l1, p2 = l2;
    	int overflow = 0;
    	ListNode l3 = null, p3 = null;
    	while (p1 != null || p2 != null)
    	{
    		int v1 = p1 == null ? 0 : p1.val;
    		int v2 = p2 == null ? 0 : p2.val;

    		ListNode node = new ListNode((v1 + v2 + overflow)%10);
    		if (l3 == null) 
    		{
    			l3 = p3 = node;
    		}
    		else 
    		{
    			p3.next = node;
    			p3 = p3.next;
    		}
    		overflow = (v1 + v2 + overflow) / 10;
    		
    		if (p1 != null) p1 = p1.next;
    		if (p2 != null) p2 = p2.next;
    	}
    	if (overflow > 0)
    		p3.next = new ListNode(overflow);
    	
    	return l3;
    }
}
