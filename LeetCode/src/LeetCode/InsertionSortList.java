package LeetCode;

public class InsertionSortList {
	//Sort a linked list using insertion sort.
    public ListNode insertionSortList(ListNode head) {
    	
    	if (head == null)
    		return head;
    	
    	ListNode nodeI = head;
    	while(nodeI.next != null)
    	{
    		ListNode nodeJ = nodeI.next;
    		if (nodeI.val > nodeJ.val)
    		{
	    		nodeI.next = nodeI.next.next;
	    		if (head.val > nodeJ.val)
	    		{
	    			nodeJ.next = head;
	    			head = nodeJ;
	    		}
	    		else
	    		{
		    		ListNode idx = head;
		    		while (idx.next.val < nodeJ.val)
						idx = idx.next;
		    		
		    		nodeJ.next = idx.next;
		    		idx.next = nodeJ;
	    		}
    		}
    		else
    			nodeI = nodeJ;
    	}
    	
    	return head;
    }	
}
