package LeetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class ListNodeComparator implements Comparator<ListNode>
{
	@Override
	public int compare(ListNode o1, ListNode o2) {
		return o1.val - o2.val;
	}
}

public class MergekSortedLists {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
    	if (lists == null || lists.size() == 0)
    		return null;    
    	
    	PriorityQueue<ListNode> queue = 
                new PriorityQueue<ListNode>(lists.size(), new ListNodeComparator());
    	for (ListNode n : lists)
    		if (n != null)
    			queue.offer(n);
    	
    	ListNode head = null;
    	ListNode tail = null;
    	while (queue.isEmpty() == false)
    	{
    		if (head == null)
    			head = tail = queue.poll();
    		else
    		{
    			tail.next = queue.poll();
    			tail = tail.next;
    		}
    		if (tail.next != null)
    			queue.offer(tail.next);
    	}
    		
    	return head;
    }	
    
}
