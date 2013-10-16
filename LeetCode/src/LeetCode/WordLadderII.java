package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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
    	
    	String dicts[] = new String[dict.size()];
        int i = 0;
        Iterator<String> iter = dict.iterator();
        while (iter.hasNext())
        	dicts[i++] = iter.next();
        int marks[] = new int[dict.size()];
        
        Queue<ArrayList<String>> que = new LinkedList<ArrayList<String>>();

        ArrayList<String> begin = new ArrayList<String>();
        begin.add(start);
        que.offer(begin);
        int len = 0;
        while (que.isEmpty() == false)
        {
        	ArrayList<String> path = que.poll();
        	if (len == 0 || path.size() < len)
        	{
	        	String last = path.get(path.size() - 1);
	        	if (isTransformable(last, end) && (len == 0 || len == path.size() + 1))
	        	{
	        		path.add(end);
	        		ret.add(path);
	        		len = path.size();
	        	}
	        	
	        	for (int k = 0; k < dicts.length; k++)
	        		if (marks[k] == 0 && isTransformable(last, dicts[k]))
	        		{
	        			@SuppressWarnings("unchecked")
						ArrayList<String> newpath = (ArrayList<String>)path.clone();
	        			newpath.add(dicts[k]);
	        			que.offer(newpath);
	        			marks[k] = 1;
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
