/* Write a program to find the node at which the intersection of two singly linked lists begins.
 * 
 * For example, the following two linked lists:
 * A:          a1 -> a2
 *                     \ 
 *                      c1 -> c2 -> c3
 *                     /
 * B:     b1 -> b2 -> b3
 * 
 * begin to intersect at node c1.
 * 
 * Notes:
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 * 
 */

package lc.q0160.IntersectionofTwoLinkedLists;

import lc.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        ListNode pa = headA;
        while(pa != null)
        {
        	pa = pa.next;
        	lenA ++;
        }
        
        int lenB = 0;
        ListNode pb = headB;
        while(pb != null)
        {
        	pb = pb.next;
        	lenB ++;
        }
        
        pa = headA;
        pb = headB;
        while(lenA > lenB)
        {
            pa = pa.next;
            lenA --;
        }
        while (lenA < lenB)
        {
            pb = pb.next;
            lenB --;
        }
        
        while(pa != null && pa != pb)
        {
        	pa = pa.next;
        	pb = pb.next;
        }
        
        return pa;
   	}
}
