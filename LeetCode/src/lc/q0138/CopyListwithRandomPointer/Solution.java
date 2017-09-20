/* A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
 * 
 * Return a deep copy of the list.
 * 
 */
package lc.q0138.CopyListwithRandomPointer;

import lc.RandomListNode;
import java.util.*;

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
    	
    	if (head == null)
    		return null;
    	
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
        RandomListNode nh = new RandomListNode(head.label);
        RandomListNode p = head;
        RandomListNode q = nh;
        while (p != null)
        {
        	if(p.random != null)
        	{
        		if (!map.containsKey(p.random))
        			map.put(p.random, new RandomListNode(p.random.label));
        		q.random = map.get(p.random);
        	}
        	if (p.next != null)
        	{
        		if (!map.containsKey(p.next))
        			map.put(p.next, new RandomListNode(p.next.label));
        		q.next = map.get(p.next);
        	}
        	p = p.next;
        	q = q.next;
        }
        
        return nh;
    }
}
