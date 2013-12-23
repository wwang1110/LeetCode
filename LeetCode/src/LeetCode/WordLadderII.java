package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class WordLadderII {
	//Given two words (start and end), and a dictionary, find all shortest transformation sequence(s) from start to end, such that:

	//Only one letter can be changed at a time
	//Each intermediate word must exist in the dictionary
	//For example,

	//Given:
	//start = "hit"
	//end = "cog"
	//dict = ["hot","dot","dog","lot","log"]
	//Return
	//  [
	//    ["hit","hot","dot","dog","cog"],
	//    ["hit","hot","lot","log","cog"]
	//  ]
	//Note:
	//All words have the same length.
	//All words contain only lowercase alphabetic characters.
    public ArrayList<ArrayList<String>> findLadders(String start, String end, HashSet<String> dict) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();
    	HashMap<String, Integer> dicts = new HashMap<String, Integer>();
    	for (String w : dict)
    		dicts.put(w, 0);
        
        Queue<ArrayList<String>> que = new LinkedList<ArrayList<String>>();

        ArrayList<String> begin = new ArrayList<String>();
        begin.add(start);
        que.offer(begin);
        que.offer(null);
        
        boolean find = false;
        while (que.isEmpty() == false)
        {
        	ArrayList<String> path = que.poll();
        	if (path == null)
        	{
        		if (find == true)
        			break;

        		if (!que.isEmpty())
    				que.offer(null);
        	}
        	else
        	{
	        	String last = path.get(path.size() - 1);
	        	
	        	//reset
	        	for (String w : dicts.keySet())
	        		dicts.put(w, 0);
	        	for (String w : path)
	        		dicts.put(w, 1);
	        	for (String w : dicts.keySet())
	        		if (dicts.get(w) == 0 && isTransformable(last, w))
	        		{
	        			@SuppressWarnings("unchecked")
						ArrayList<String> list = (ArrayList<String>) path.clone();
	        			list.add(w);
	        		}
        	}
        }
        
        return ret;
    }
	private boolean isTransformable(String start, String end)
	{
		int len = start.length();
		int cnt = 0;
		for (int i = 0; i < len; i++)
			if (start.charAt(i)!=end.charAt(i))cnt++;
		return cnt == 1;
	}
}
