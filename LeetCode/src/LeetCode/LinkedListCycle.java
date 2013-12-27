package LeetCode;

public class LinkedListCycle {
	//Given a linked list, determine if it has a cycle in it.

	//Follow up:
	//Can you solve it without using extra space?
    public boolean hasCycle(ListNode head) {
    	ListNode fast = head;
    	ListNode slow = head;
    	
    	while (fast != null && fast.next != null)
    	{
    		fast = fast.next;
    		fast = fast.next;
    		
    		slow = slow.next;
    		
    		if (fast == slow)
    			return true;
    	}
    	return false;
    }
}
