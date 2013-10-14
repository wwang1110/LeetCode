package LeetCode;

public class RemoveDuplicatesfromSortedList {
	//Given a sorted linked list, delete all duplicates such that each element appear only once.

	//For example,
	//Given 1->1->2, return 1->2.
	//Given 1->1->2->3->3, return 1->2->3.
    public ListNode deleteDuplicates(ListNode head) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	if (head != null && head.next != null)
    	{
    		if (head.val == head.next.val)
    		{
    			head.next = head.next.next;
    			head = deleteDuplicates(head);
    		}
    		else
    		{
    			head.next = deleteDuplicates(head.next);
    		}
    		
    	}
    	return head;
    }	
}
