package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class WordLadder {
	//Given two words (start and end), and a dictionary, find the length of shortest transformation 
	//sequence from start to end, such that:

	//	Only one letter can be changed at a time
	//	Each intermediate word must exist in the dictionary
	//	For example,

	//	Given:
	//	start = "hit"
	//	end = "cog"
	//	dict = ["hot","dot","dog","lot","log"]
	//	As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
	//	return its length 5.

	//	Note:
	//	Return 0 if there is no such transformation sequence.
	//	All words have the same length.
	//	All words contain only lowercase alphabetic characters.
	private boolean isTransformable(String start, String end)
	{
		int len = start.length();
		int cnt = 0;
		for (int i = 0; i < len; i++)
			if (start.charAt(i)!=end.charAt(i))cnt++;
		return cnt == 1;
	}
    public int ladderLength(String start, String end, HashSet<String> dict) {
    	dict.add(end);
    	HashMap<String, Integer> marked = new HashMap<String, Integer>(); 
    	for (String s : dict)
    		marked.put(s, Integer.MAX_VALUE);
    	marked.put(start, 1);
    	Queue<String> que = new LinkedList<String>(); 
    	que.offer(start);
    	
    	while (que.size() > 0)
    	{
    		String str = que.poll();
    		for (String s : dict)
    		{
    			if (!s.equals(str) && marked.get(s) == Integer.MAX_VALUE && isTransformable(str, s))
    			{
    				int steps = Math.min(marked.get(str) + 1, marked.get(s));
    				if (s.equals(end))
    					return steps;
    				marked.put(s, steps);
    				que.offer(s);
    			}
    		}
    	}
    	return 0;
    }
}
