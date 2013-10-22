package LeetCode;

public class ReverseNodesinkGroup {
	//Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

	//If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

	//You may not alter the values in the nodes, only nodes itself may be changed.

	//Only constant memory is allowed.

	//For example,
	//Given this linked list: 1->2->3->4->5

	//For k = 2, you should return: 2->1->4->3->5

	//For k = 3, you should return: 3->2->1->4->5
	ListNode oldnode = null;
	ListNode newnode = null;
    public ListNode reverseKGroup(ListNode head, int k) {
    	if (head == null)
    		return null;
    	
    	int len = 0;
    	ListNode node = head;
    	while (node != null)
    	{
    		node = node.next;
    		len++;
    	}
    	oldnode = null;
    	newnode = null;
    	reverseKGroup(head, k, k, len);
    	return newnode;
    }
    
    private ListNode reverseKGroup(ListNode node, int k, int t, int len) {
    	
    	if (len < k && t == k)
    	{
    		newnode = node;
    		return node;
    	}
    	
    	ListNode n = reverseKGroup(node.next, k, t == 1 ? k : t-1, len - 1);
    	
    	if (t == 1)
    	{
    		oldnode = newnode;
    		newnode = node;
    	}
    	else
    	{
        	n.next = node;
        	if (t == k)
        		node.next = oldnode;
    	}
    	return node;
    }	
}
