package LeetCode;

public class SortList {
	//Sort a linked list in O(n log n) time using constant space complexity.
    public ListNode sortList(ListNode head) {
    	return MergeSort(head);
    }
    
    private ListNode Merge(ListNode l1, ListNode l2) {
    	ListNode head = new ListNode(-1);
    	ListNode idx = head;
    	while (l1 != null && l2 != null)
    	{
    		if (l1.val < l2.val)
    		{
    			idx.next = l1;
    			l1 = l1.next;
    		}
    		else
    		{
    			idx.next = l2;
    			l2 = l2.next;
    		}
    		idx = idx.next;
    	}
    	
    	if (l1 != null)
    		idx.next = l1;
    	else
    		idx.next = l2;
    		
		return head.next;
	}

	private ListNode MergeSort(ListNode head) {
    	int num = getLen(head);
        if (num < 2)
        	return head;
        
        ListNode idx = head;
        int x = num / 2;
        while (--x > 0)
        	idx = idx.next;
        ListNode head2 = idx.next;
        idx.next = null;
        
        ListNode l1 = MergeSort(head);
        ListNode l2 = MergeSort(head2);
        return Merge(l1, l2);
	}

	private int getLen(ListNode node){
        int num = 0;
        ListNode idx = node;
        while (idx != null)
        {
        	num++;
        	idx = idx.next;
        }
        
        return num;
    }
}
