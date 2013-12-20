package LeetCode;

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
    public int ladderLength(String start, String end, HashSet<String> dict) {
    	
    	dict.add(end);
    	
    	Queue<String> que = new LinkedList<String>(); 
    	que.offer(start);
    	que.offer(null);
    	int steps = 1;
    	while (que.size() > 0)
    	{
    		String str = que.poll();
    		
    		if (str == null)
    		{
    			steps++;
    			if (!que.isEmpty())
    				que.offer(null);
    		}
    		else
    		{
    			if (str.equals(end))
    				return steps;

        		for (int i = 0; i < str.length(); i++)
        			for (char c = 'a'; c <= 'z'; c++ )
        			{
        				if ( c == str.charAt(i))
        					continue;

            			char[] arr = str.toCharArray();
        				arr[i] = c;
        				String newstr = String.valueOf(arr);
        				if (dict.contains(newstr))
        				{
        					que.offer(newstr);
        					dict.remove(newstr);
        				}
        			}
    		}
    	}
    	
    	return 0;
    }
}
