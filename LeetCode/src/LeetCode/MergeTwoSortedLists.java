package LeetCode;

public class MergeTwoSortedLists {
	//Merge two sorted linked lists and return it as a new list. 
	//The new list should be made by splicing together the nodes of the first two lists.
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode l3 = new ListNode(-1);
    	ListNode tail = l3;
    	
    	while (l1 != null && l2 != null)
    	{
    		if (l1.val <= l2.val)
    		{
    			tail.next = l1;
    			l1 = l1.next;
    		}
    		else
    		{
    			tail.next = l2;
    			l2 = l2.next;
    		}
    		tail = tail.next;
    	}
    	
    	if (l1 != null)
    		tail.next = l1;
    	if (l2 != null)
    		tail.next = l2;
    	
    	return l3.next;
    }
}
