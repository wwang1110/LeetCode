package LeetCode;

public class PartitionList {
	//Given a linked list and a value x, partition it such that all nodes less than x come 
	//before nodes greater than or equal to x.

	//You should preserve the original relative order of the nodes in each of the two partitions.

	//For example,
	//Given 1->4->3->2->5->2 and x = 3,
	//return 1->2->2->4->3->5.
    public ListNode partition(ListNode head, int x) {
    	ListNode before = null;
    	ListNode after = null;
    	ListNode btail = null;
    	ListNode atail = null;
    	for (ListNode n = head; n != null; n = n.next)
    	{
    		if (n.val < x)
    		{
    			if (before == null)
    				before = btail = n;
    			else
    			{
    				btail.next = n;
    				btail = btail.next;
    			}
    		}
    		else
    		{
    			if (after == null)
    				after = atail = n;
    			else
    			{
    				atail.next = n;
    				atail = atail.next;
    			}
    		}
    	}
    	btail.next = after;
    	atail.next = null;
    	return before;
    }
}
