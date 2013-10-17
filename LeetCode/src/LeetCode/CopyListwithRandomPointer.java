package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class CopyListwithRandomPointer {
	//A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

	//Return a deep copy of the list.
	   public RandomListNode copyRandomList(RandomListNode head) {
			if (head == null)
				return null;
			
			HashMap<RandomListNode, Integer> map = new HashMap<RandomListNode, Integer>(); 
			ArrayList<RandomListNode> nodes = new ArrayList<RandomListNode>(); 
			int idx = 0;
			RandomListNode node = head;
			while (node != null)
			{
				map.put(node, idx++);
				nodes.add(new RandomListNode(node.label));
				node = node.next;
			}
			
			ArrayList<Integer> links = new ArrayList<Integer>();
			node = head;
			while (node != null)
			{
				if (node.random == null)
					links.add(-1);
				else
					links.add(map.get(node.random));
				node = node.next;
			}
			
			for (int i = 0; i < nodes.size(); i++)
			{
				if (i != nodes.size() -1)
					nodes.get(i).next = nodes.get(i+1);
				else
					nodes.get(i).next = null;
				
				if (links.get(i) == -1)
					nodes.get(i).random = null;
				else
					nodes.get(i).random = nodes.get(links.get(i));
			}
			
			return nodes.get(0);
	    }
}
