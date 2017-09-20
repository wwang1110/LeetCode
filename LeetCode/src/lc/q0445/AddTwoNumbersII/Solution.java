/* You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * Follow up:
 * What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
 * Example:
 * Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 8 -> 0 -> 7
 * 
 */
package lc.q0445.AddTwoNumbersII;

import lc.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ll1=revert(l1);
        ListNode ll2=revert(l2);
        int extra=0;
        ListNode p=ll1;
        ListNode q=ll2;
        ListNode ll3=null;
        ListNode r=null;
        while(p!=null||q!=null||extra!=0)
        {
        	int sum=extra;
        	if(p!=null)
        	{
        		sum+=p.val;
        		p=p.next;
        	}
        	
        	if(q!=null)
        	{
        		sum+=q.val;
        		q=q.next;
        	}
        	
        	if(r==null)
            {
        		ll3=new ListNode(sum%10);
                r=ll3;
            }
        	else
            {
        		r.next=new ListNode(sum%10);
                r=r.next;
            }
        	extra = sum/10;
        }
        return revert(ll3);
    }

	private ListNode revert(ListNode node) {
		if(node==null||node.next==null)
			return node;
		ListNode p = revert(node.next);
 		node.next.next = node;
		node.next=null;
		return p;
	}
}
