package LeetCode;

import java.util.HashMap;

public class CopyListwithRandomPointer {
	//A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

	//Return a deep copy of the list.
	HashMap<RandomListNode, RandomListNode> map;
	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null)
			return null;
		
		map = new HashMap<RandomListNode, RandomListNode>();
		map.put(null, null);
		return copy(head);
    }

	private RandomListNode copy(RandomListNode node) {
		if (!map.containsKey(node))
		{
			RandomListNode newNode = new RandomListNode(node.label);
			map.put(node, newNode);
			newNode.next = copy(node.next);
			newNode.random = copy(node.random);
			return newNode;
		}
		
		return map.get(node);
	}
}
