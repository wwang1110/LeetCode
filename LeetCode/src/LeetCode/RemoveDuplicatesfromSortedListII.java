package LeetCode;

public class RemoveDuplicatesfromSortedListII {
	//Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

	//For example,
	//Given 1->2->3->3->4->4->5, return 1->2->5.
	//Given 1->1->1->2->3, return 2->3.
    public ListNode deleteDuplicates(ListNode head) {
    	if (head == null)
    		return head;
    	
    	ListNode node = head;
    	while(node.next != null && node.val == node.next.val)
    		node = node.next;

    	if (node != head)
    		head = deleteDuplicates(node.next);
    	else
    		head.next = deleteDuplicates(node.next);
    		
    	return head;
    }
}
