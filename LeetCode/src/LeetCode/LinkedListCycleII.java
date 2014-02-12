package LeetCode;

public class LinkedListCycleII {
	//Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

	//Follow up:
	//Can you solve it without using extra space?
	
    public ListNode detectCycle(ListNode head) {
    	ListNode fast = head;
    	ListNode slow = head;
    	
    	boolean find = false;
    	while (fast != null && fast.next != null)
    	{
    		fast = fast.next;
    		fast = fast.next;
    		
    		slow = slow.next;
    		
    		if (fast == slow)
    		{
    			find = true;
    			break;
    		}
    	}
    	
    	if (find == false)
    		return null;

    	fast = head;
    	while (fast != slow)
    	{
    		fast = fast.next;
    		slow = slow.next;
    	}
    	
    	return fast;
    }
}
