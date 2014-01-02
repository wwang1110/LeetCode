package LeetCode;

public class ReorderList {
	//Given a singly linked list L: L0->L1->…->Ln-1->Ln,
	//reorder it to: L0->Ln->L1->Ln-1->L2->Ln-2->…

	//You must do this in-place without altering the nodes' values.

	//For example,
	//Given {1,2,3,4}, reorder it to {1,4,2,3}.
    public void reorderList(ListNode head) {
        int num = 1;
        ListNode node = head;
        while(node != null && node.next != null)
        {
        	node = node.next;
        	num++;
        }
        
        if (num <= 2)
        	return;
        
        int count = num / 2 - 1;
        ListNode p = head;
        while (count > 0)
        {
        	p = p.next;
        	count--;
        }

        ListNode head1 = head;
        
        ListNode mid = null;
        if (num % 2 == 1)
        {
        	mid = p.next;
        	p.next = null;
        	p = mid;
        }
        
        ListNode head2 = p.next;
        p.next = null;
        
        head2 = reverseList(head2);

        p = null;
        while (head1 != null)
        {
        	if (p == null)
                p = head1;
        	else
        	{
        		p.next = head1;
        		p = p.next;
        	}
            head1 = head1.next;
            
            p.next = head2;
            head2 = head2.next;
            p = p.next;
        }
        
        p.next = mid;
    }

	private ListNode reverseList(ListNode node) {
		if (node == null || node.next == null)
			return node;
		ListNode head = reverseList(node.next);
		node.next.next = node;
		node.next = null;
		return head;
	}
}
