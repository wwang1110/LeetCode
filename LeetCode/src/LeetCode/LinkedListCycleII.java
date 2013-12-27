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
    	
    	int nodesInLoop = 0;
    	do
    	{
    		fast = fast.next;
    		nodesInLoop++;
    	}
    	while(fast != slow);
    	
    	slow = head;
    	fast = head;
    	for (int i = 0; i < nodesInLoop; i++)
    		fast = fast.next;
    	
    	while (slow != fast)
    	{
    		fast = fast.next;
    		slow = slow.next;
    	}
    	
    	return slow;
    }	
}
